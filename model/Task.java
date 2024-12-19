package model;

import java.time.LocalTime;

public class Task {


    private String id;
    private String description;
    private LocalTime time;
    private String location;
    private TaskStatus status; // Enum for task status
    private Patient patient;


    public Task(String id, String description, LocalTime time, String location, Patient patient) {
        this.id = id;
        this.description = description;
        this.time = time;
        this.location = location;
        this.patient = patient;
        this.status = TaskStatus.PENDING; // Default status
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id='" + id  + ", description='" + description + " time=" + time + " location='" + location +  " status=" + status + "patient=" + patient ;
    }

    // Equals method to compare tasks based on their unique ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // If they are the same object, they're equal
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return id != null && id.equals(task.id); // Compare IDs for equality
    }

    // Enum for task statuses
    public enum TaskStatus {
        PENDING,
        IN_PROGRESS,
        COMPLETED,
        CANCELLED
    }
}
