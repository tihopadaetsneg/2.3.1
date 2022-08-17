package MyApp.dao;

import MyApp.models.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers ();
    User getUserById(long id);
    void saveUser (User user);
    void deleteById(long id);
    void updateUser(long id, User user);
}