package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Journal {
    private int id;
    private String cprNumber;
    private String name;
    private String gender;
    private int age;
    private List<String> diagnoses;
    private String notes;
    private String doctor;
    private LocalDateTime lastUpdated;

    // Constructor
    public Journal(int id, String cprNumber, String name, String gender, int age, String doctor) {
        this.id = id;
        this.cprNumber = cprNumber;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.diagnoses = new ArrayList<>();
        this.notes = "";
        this.doctor = doctor;
        this.lastUpdated = LocalDateTime.now();
    }

    // Method to add a diagnosis
    public void addDiagnosis(String diagnosis) {
        if (diagnosis != null && !diagnosis.trim().isEmpty()) {
            diagnoses.add(diagnosis);
            updateLastUpdated();
        }
    }

    // Method to remove a diagnosis
    public void removeDiagnosis(String diagnosis) {
        if (diagnoses.contains(diagnosis)) {
            diagnoses.remove(diagnosis);
            updateLastUpdated();
        }
    }

    // Update the lastUpdated field
    private void updateLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
    }

    // Getters for testing purposes
    public List<String> getDiagnoses() {
        return diagnoses;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }
}
