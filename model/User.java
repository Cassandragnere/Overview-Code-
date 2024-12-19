package model;

public class User {

    // Attributes
    private int id;
    private String username;
    private String password;
    private String role;

    public User() {} // Default constructor

    public User(int id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) { // Setter method for role.
        this.role = role;
    }

    public boolean login(String username, String inputPassword) { // Method to check login credentials.
        return this.username.equals(username) && this.password.equals(inputPassword); // Returns true if username and password match; otherwise false.
    }

    public String toString() {
        return "Id: " + id + ", Username: " + username + ", Role: " + role;
    }

    public int getName() {
        return 0;
    }
}
