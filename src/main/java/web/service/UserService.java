package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    User get(long id);

    void update(long id, User user);

    void delete(long id);

    List<User> getUsersList();
}
