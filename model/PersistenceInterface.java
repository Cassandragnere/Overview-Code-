package model;

import java.io.FileNotFoundException;
import java.util.List;

public interface PersistenceInterface {
    void saveUsers(List<User> users, String fileName) throws FileNotFoundException;

    List<User> loadUsers(String fileName) throws FileNotFoundException;
}
