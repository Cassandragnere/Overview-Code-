package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class HealthcareWorker {
    private int id;
    private String username;
    private String password;
    private List<Schedule> schedules;
    private Task currentTask;

    // Constructor
    public HealthcareWorker(int id, String username, String password, List<Schedule> schedules) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.schedules = schedules != null ? schedules : new ArrayList<>(); // Initializes schedules to the given list if it's not null; otherwise, to an empty list
    }

    // Getters and Setters
    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public Task getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(Task currentTask) {
        this.currentTask = currentTask;
    }

    // Method to view all tasks from all schedules
    public List<Task> viewSchedule() {
        return schedules.stream()
                .flatMap(schedule -> schedule.getTasks().stream())
                .collect(Collectors.toList());
    }

    // Check-in to a task
    public void checkIn(String taskId) { // Method to check in to a task using its taskId.
        if (currentTask != null && String.valueOf(currentTask.getId()).equals(taskId)) {
            // Checks if there is a current task and if its ID matches the provided taskId.
            System.out.println("Checked in to task: " + currentTask.getDescription());

        } else {
            System.out.println("No task found to check in with ID: " + taskId);

        }
    }

    // Check-out from a task
    public void checkOut(String taskId) {
        if (currentTask != null && String.valueOf(currentTask.getId()).equals(taskId)) {
            System.out.println("Checked out from task: " + currentTask.getDescription());
            currentTask = null; // Clear the current task after check-out
        } else {
            System.out.println("No task found to check out with ID: " + taskId);
        }
    }

    // Access patient profile using ModelManager
    public Patient accessPatientProfile(ModelManager modelManager, int patientId) {
        return modelManager.getPatients().stream()
                .filter(patient -> patient.getId() == patientId)
                .findFirst()
                .orElse(null);
    }

    // Document progress on a specific task
    public void documentTask(String taskId, String notes) {
        if (currentTask != null && String.valueOf(currentTask.getId()).equals(taskId)) {
            System.out.println("Task ID: " + taskId + " documented with notes: " + notes);
        } else {
            System.out.println("No active task found to document with ID: " + taskId);
        }
    }

    @Override
    public String toString() {
        return "HealthcareWorker{" +
                "id=" + id + " username='" + username + " schedules=" + schedules.size() +
                "currentTask=" + (currentTask != null ? currentTask.getDescription() : "None") ;



    }


    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthcareWorker other = (HealthcareWorker) obj;
        return id==(other.id) && Objects.equals(username, other.username) && password.equals(other.password)&&schedules.equals(other.schedules);
    }

    public int getId() {
        return id;
    }
}
