package web.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    public UserDaoImpl() {
    }

    @Override
    public User save(User user) {
        em.persist(user);
        return user;
    }

    @Override
    public void update(Long id, User user) {
        User findUser = em.find(User.class, id);
        if (findUser != null) {
            findUser.setName(user.getName());
            findUser.setCourse(user.getCourse());
            findUser.setEmail(user.getEmail());
            em.merge(findUser);
        } else {
            System.out.println("User with id " + id + " not found");
        }
    }

    @Override
    public void delete(Long id) {
        User deleteUser = em.find(User.class, id);
        if (deleteUser != null) {
            em.remove(deleteUser);
        }
    }

    @Override
    public User findById(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("from User", User.class).getResultList();
    }
}
