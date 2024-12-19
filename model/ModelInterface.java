package model;

public interface ModelInterface {
    // User Management
    void createUser(int id, String username, String password, String role);
    boolean login(String username, String password);
    Patient getPatientById(int id);
    void addSchedule(Schedule schedule);
    Schedule getScheduleById(int id);
    // Journal Management
    void addJournalEntry(int patientId, String entry); // Adds a journal entry for a specific patient
    String getJournalEntries(int patientId); // Retrieves journal entries for a specific patient
}

