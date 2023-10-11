package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public UserDaoImp() {}

    @Override
    public void addUser(User user) { entityManager.persist(user); }

    @Override
    public void deleteUser(long id) {
        User user = entityManager.find(User.class, id);
        if (user != null) { entityManager.remove(user); }
    }
    @Override
    public void updateUser(User user) {
        entityManager.merge(user); }

    @Override
    public User getUser(long id) { return entityManager.find(User.class, id); }

    @Override
    public List<User> getAllUsers() { return entityManager.createQuery("select u from User u", User.class).getResultList(); }
}
