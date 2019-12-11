package app;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) {

	Session session = HibernateSessionFactory.getSessionFactory().openSession();

	Transaction transaction = session.beginTransaction();

	transaction.commit();

	session.close();
    }

}