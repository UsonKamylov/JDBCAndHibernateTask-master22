package peaksoft;

import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
//        Util.connection().close();
        UserDaoJdbcImpl u=new UserDaoJdbcImpl();
//   u.createUsersTable();
//    u.dropUsersTable();
       u.saveUser("Asan","Taiirov", (byte) 24);
       u.saveUser("Malika","Moloshova", (byte) 18);
       u.saveUser("Bakyt","Latibov", (byte) 22);
       u.saveUser("Nurisa","Jarmamatova", (byte) 20);
       u.saveUser("Uson","Kamylov", (byte) 23);
//        u.removeUserById(5);
//        for (User user : u.getAllUsers()) {
////
//            System.out.println(user);
//        }
//        u.cleanUsersTable();

    }
}
