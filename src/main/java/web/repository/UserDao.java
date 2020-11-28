package web.repository;

import web.model.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);
    List<User> getAllUsers();
    void updateUser(User user);
    void deleteUser(Long id);
    User getUserByName(String name);
    User getUserById(Long id);
}
