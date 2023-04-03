package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private UserDao userDao;
    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }
    @Transactional
    @Override
    public User get(long id) {
        return userDao.get(id);
    }
    @Transactional
    @Override
    public void update(long id, User user) {
        userDao.update(id, user);
    }
    @Transactional
    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
    @Transactional
    @Override
    public List<User> getUsersList() {
        return userDao.getUsersList();
    }
}
