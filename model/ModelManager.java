package model;

import java.util.ArrayList;

public class ModelManager implements ModelInterface {

    private ArrayList<User> users;
    private ArrayList<HealthcareWorker> healthcareWorkers;
    private ArrayList<Patient> patients;
    private ArrayList<Task> tasks;
    private ArrayList<Schedule> schedules;

    public ModelManager() { // Constructor
        users = new ArrayList<>(); // Initializes the users list.
        healthcareWorkers = new ArrayList<>();
        patients = new ArrayList<>();
        tasks = new ArrayList<>();
        schedules = new ArrayList<>();
    }

    @Override
    public void createUser(int id, String username, String password, String role) { // Creates a new User and adds it to the list.
        users.add(new User(id, username, password, role)); // Adds a new User object to the users list.
    }

    @Override
    public boolean login(String username, String password) { // Checks if login credentials are valid.
        for (User user : users) { // Iterates through the users list.
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) { // Checks if username and password match.
                return true; // Returns true if a match is found.
            }
        }
        return false;
    }

    // Access Methods
    public ArrayList<Patient> getPatients() { // Getter for the patients list.
        return patients;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public ArrayList<Schedule> getSchedules() { //
        return schedules;
    }

    public void addPatient(Patient patient) { // Adds a Patient object to the patients list.
        patients.add(patient);
    }

    public Patient getPatientById(int id) { // Retrieves a Patient object by ID.
        for (Patient patient : patients) {
            if (patient.getId() == id) {
                return patient;
            }
        }
        return null;
    }

    public void addTask(Task task) { // Adds a Task object to the tasks list.
        tasks.add(task);
    }

    public Task getTaskById(int id) { // Retrieves a Task object by ID (not yet implemented).
        return null;
    }

    public void addHealthcareWorker(HealthcareWorker worker) { // Adds a HealthcareWorker object to the healthcareWorkers list.
        if (worker != null) { // Checks if the worker object is not null.
            healthcareWorkers.add(worker); // Adds the HealthcareWorker to the list.
        }
    }


    public HealthcareWorker getHealthcareWorkerById(int id) { // Retrieves a HealthcareWorker object by ID.
        for (HealthcareWorker worker : healthcareWorkers) {
            if (worker.getId() == id) {
                return worker;
            }
        }
        return null;
    }


    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public Schedule getScheduleById(int id) { // Retrieves a Schedule object by ID.
        for (Schedule schedule : schedules) {
            if (schedule.getId() == id) {
                return schedule;
            }
        }
        return null; //
    }

    @Override
    public void addJournalEntry(int patientId, String entry) {

    }

    @Override
    public String getJournalEntries(int patientId) {
        return null;
    }

}
