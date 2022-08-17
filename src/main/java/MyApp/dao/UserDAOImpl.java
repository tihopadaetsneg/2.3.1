package MyApp.dao;

import org.springframework.stereotype.Component;
import MyApp.models.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component

public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {

        return entityManager.createQuery("select a from User a", User.class).getResultList();
    }

    @Override
    public User getUserById(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteById(long id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    public void updateUser(long id, User user) {
        User user1;
        user1 = getUserById(id);
        entityManager.detach(user1);
        user1.setName(user.getName());
        user1.setSurname(user.getSurname());
        entityManager.merge(user1);
    }





}
