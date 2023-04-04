package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    void add(User car);

    void update(User user);

    void delete(long id);

    List<User> getUsersList();
}
