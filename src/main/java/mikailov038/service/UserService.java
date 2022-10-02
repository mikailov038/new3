package mikailov038.service;

import mikailov038.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(User user);

    List<User> getUsers();

    User getUserById(long id);
}


