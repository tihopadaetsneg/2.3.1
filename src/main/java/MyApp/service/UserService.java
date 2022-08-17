package MyApp.service;
import MyApp.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers ();
    User getUserById(long id);
    void saveUser (User user);
    void deleteById(long id);
    void updateUser(long id, User user);

}
