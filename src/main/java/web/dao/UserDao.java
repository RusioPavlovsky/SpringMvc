package web.dao;

import web.model.User;

import java.util.List;

//fixme в интерфейсе методы по умолчанию public abstract, излишне явно указывать public
public interface UserDao {
    User save(User user);

    void update(Long id, User user);

    void delete(Long id);

    User findById(Long id);

    List<User> findAll();
}

