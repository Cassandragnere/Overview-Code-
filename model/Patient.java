package model;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    private int id;
    private String name;
    private String address;
    private List<String> medicalHistory;
    private String dosage;
    private String startDate;
    private String endDate;

    private boolean isCompleted;

    public Patient(int id, String name, String address, String dosage, String startDate,String endDate){
        this.id=id;
        this.name=name;
        this.address=address;
        this.dosage=dosage;
        this.endDate=endDate;
        this.startDate=startDate;

        this.medicalHistory = new ArrayList<>();
        this.isCompleted = false;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public boolean isCompleted(){
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted){
        this.isCompleted=isCompleted;
    }
    public void addMedicalHistory(String entry) {
        medicalHistory.add(entry);//adds medical history if neccesarry
    }
    public void displayMedicationInfo() {
        System.out.println("Medication ID: " + id);
        System.out.println("Name: " + name);

        System.out.println("Dosage: " + dosage);

        System.out.println("Start Date: " + startDate);

        System.out.println("End Date: " + endDate);



}}








