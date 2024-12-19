package model;

public class Note {
    private int id;
    private String content;
    private String timestamp;

    // Constructor
    public Note(int id, String content, String timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    // Setter for content
    public void setContent(String content) {
        this.content = content;
    }

    // Method to display note details
    public void displayNote() {
        System.out.println("Note ID: " + id);
        System.out.println("Content: " + content);
        System.out.println("Timestamp: " + timestamp);
    }
}
