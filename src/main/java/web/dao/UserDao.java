package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    void add(User car);

    User get(long id);

    void update(long id, User user);

    void delete(long id);

    List<User> getUsersList();
}
