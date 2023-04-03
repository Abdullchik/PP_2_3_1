package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao{

    private EntityManager entityManager;

    public UserDaoImp() {

    }

    public UserDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }
    @Override
    public User get(long id) {
        return entityManager.find(User.class, id);
    }
    @Override
    public void update(long id, User user) {
        user.setId(id);
        entityManager.merge(user);
    }
    @Override
    public void delete(long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }
    @Override
    public List<User> getUsersList() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
}