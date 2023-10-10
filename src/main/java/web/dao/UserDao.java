package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {

    public void addUser(User user);
    public void deleteUser(long id);
    public void updateUser(User user);
    public User getUser(long id);
    public List<User> getAllUsers();

}
