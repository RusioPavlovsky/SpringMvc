package web.service;

import web.model.User;

import java.util.List;

//fixme в интерфейсе методы по умолчанию public abstract, излишне явно указывать public
public interface UserService {
    User addUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);

    User findByIdUser(Long id);

    List<User> findAllUser();
}
