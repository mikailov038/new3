package mikailov038.dao;

import mikailov038.model.User;

import java.util.List;

public interface UserDao {

    void addUser(User user);

    void deleteUser(long id);

    void updateUser(User user);

    List<User> getUsers();

    User getUserById(long id);
}


