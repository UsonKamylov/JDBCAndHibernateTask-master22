package peaksoft.service;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
//    UserDaoJdbcImpl u=new UserDaoJdbcImpl();
    UserDaoHibernateImpl uh=new UserDaoHibernateImpl();

    public void createUsersTable() {
//        u.createUsersTable();
        uh.createUsersTable();
    }

    public void dropUsersTable() {
//        u.dropUsersTable();
        uh.dropUsersTable();
    }


    public void saveUser(String name, String lastName, Byte age) {
//        u.saveUser("Kanat","Subanov",(byte)23);
        uh.saveUser("Kanat","Subanov",(byte) 23);
    }


    public void removeUserById(long id) {
//        u.removeUserById((long) id);
        uh.removeUserById((Long) id);
    }

    public List<User> getAllUsers() {
//        return u.getAllUsers();
        return uh.getAllUsers();
    }

    public void cleanUsersTable() {
//        u.cleanUsersTable();
        uh.cleanUsersTable();
    }
}
