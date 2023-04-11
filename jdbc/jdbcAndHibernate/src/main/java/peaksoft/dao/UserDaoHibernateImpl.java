package peaksoft.dao;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import peaksoft.model.User;
import peaksoft.util.HibernateUtil;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {

    public UserDaoHibernateImpl() {

    }
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";


    @Override
    public void createUsersTable() {
        Session session = HibernateUtil.getSessionFactory().openSession();
//        String SQL = "CREATE TABLE IF NOT EXISTS users(" +
//                "id SERIAL PRIMARY KEY," +
//                "name VARCHAR(50) NOT NULL," +
//                "lastName VARCHAR(50) NOT NULL," +
//                "age SMALLINT);";
        session.beginTransaction();
//        session.createQuery(SQL).executeUpdate();
        session.getTransaction().commit();
        session.close();


//        session.save();
//        session.getTransaction().commit();
//        session.close();
//        System.out.println("SuccessFull create student");
//        return student.getId();
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        List<Car> cars =
//                session.createQuery("FROM Car ").getResultList();
//        session.getTransaction().commit();
//        session.close();
//        return cars;


    }

    @Override
    public void dropUsersTable() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String SQL="DROP TABLE IF EXISTS users";
        session.createSQLQuery(SQL).executeUpdate();
        System.out.println(ANSI_BLUE + "TABLES DELETED" + ANSI_RESET);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        User user = new User();
        user.setName(name);
        user.setLastName(lastName);
        user.setAge(age);
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public void removeUserById(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = session.get(User.class, id);
        session.remove(user);
        session.getTransaction().commit();
        session.close();


    }

    @Override
    public List<User> getAllUsers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<User> users =
                session.createQuery("FROM User").list();
        session.getTransaction().commit();
        session.close();
        return users;
    }


    @Override
    public void cleanUsersTable() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String SQL = "TRUNCATE TABLE users";
        session.createSQLQuery(SQL).executeUpdate();
        System.out.println(ANSI_GREEN + "CLEANED TABLES" + ANSI_RESET);
        session.getTransaction().commit();
        session.close();

    }
}
