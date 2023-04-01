package peaksoft.service;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDaoJdbcImpl u=new UserDaoJdbcImpl();

    public void createUsersTable() {
        u.createUsersTable();
    }

    public void dropUsersTable() {
        u.dropUsersTable();
    }


    public void saveUser(String name, String lastName, Byte age) {
        u.saveUser("Kanat","Subanov",(byte)23);
    }


    public void removeUserById(long id) {
        u.removeUserById((long) id);
    }

    public List<User> getAllUsers() {
        return u.getAllUsers();
    }

    public void cleanUsersTable() {
        u.cleanUsersTable();
    }
}
