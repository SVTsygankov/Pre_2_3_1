package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    UserServiceImp(UserDao userDao) { this.userDao = userDao; }

    @Override
    public void addUser(User user) { userDao.addUser(user); }

    @Override
    public void deleteUser(long id) { userDao.deleteUser(id); }

    @Override
    public void updateUser(User user) { userDao.updateUser(user); }

    @Override
    public  User getUser(long id) { return userDao.getUser(id); }

    @Override
    public List<User> getAllUsers() {return userDao.getAllUsers(); }

}
