package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenceManager implements PersistenceInterface {

    // Reference to the file name (users.txt)
    private static final String USER_FILE = "users.txt";

    @Override
    public void saveUsers(List<User> users, String fileName) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(USER_FILE))) {
            for (User user : users) {
                writer.println(user.getId() + "," + user.getName() + ","
                        + user.getPassword() + "," + user.getRole());
            }
            System.out.println("Users successfully saved to " + USER_FILE);
        } catch (IOException e) {
            System.err.println("Error saving users: " + e.getMessage());
        }
    }

    @Override
    public List<User> loadUsers(String fileName) throws FileNotFoundException {
        List<User> users = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String password = parts[2];
                    String role = parts[3];
                    users.add(new User(id, name, password, role));
                }
            }
            System.out.println("Users successfully loaded from " + USER_FILE);
        } catch (IOException e) {
            throw new FileNotFoundException("Error reading file: " + e.getMessage());
        }
        return users;
    }
}
