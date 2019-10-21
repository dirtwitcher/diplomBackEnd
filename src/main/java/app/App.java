package app;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Auto;

public class App {

    public static void main(String[] args) {

	/*
	 * StandardServiceRegistry standardRegistry = new
	 * StandardServiceRegistryBuilder().configure("hibernate.cfg.xml") .build();
	 * Metadata metadata = new
	 * MetadataSources(standardRegistry).getMetadataBuilder().build();
	 * 
	 * SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
	 */

	Session session = HibernateSessionFactory.getSessionFactory().openSession();

//	Session session = sessionFactory.openSession();

	Transaction transaction = session.beginTransaction();

	/*
	 * // set data
	 * 
	 * Student student = new Student();
	 * 
	 * student.setFirstName("firts"); student.setLastName("last");
	 * student.setAge(18);
	 * 
	 * session.save(student);
	 */

	/*
	 * // get data
	 * 
	 * Student student = session.get(Student.class, 1);
	 * 
	 * System.out.println(student);
	 */

	Query query = session.createQuery("from Auto"); // HQL - hibernate ql
	@SuppressWarnings("unchecked")
	List<Auto> auto = query.getResultList();

	transaction.commit();

	session.close();
	// sessionFactory.close();

	System.out.println(auto);
	System.out.println("work done");
    }

}