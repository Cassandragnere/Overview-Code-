package model;

public class Medication {
    private int id;
    private String name;
    private String dosage;
    private String frequency;
    private String startDate;
    private String endDate;

    // Constructor
    public Medication(int id, String name, String dosage, String frequency, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.dosage = dosage;
        this.frequency = frequency;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDosage() {
        return dosage;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    // Method to display medication details
    public void displayMedicationInfo() {
        System.out.println("Medication ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Dosage: " + dosage);
        System.out.println("Frequency: " + frequency);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
    }
}
