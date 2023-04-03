package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }
    @Override
    public User get(long id) {
        return userDao.get(id);
    }
    @Override
    public void update(long id, User user) {
        userDao.update(id, user);
    }
    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
    @Override
    public List<User> getUsersList() {
        return userDao.getUsersList();
    }
}
