package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.OsvetPribory;

public class OsvetPriboryImpl implements CrudInterface<OsvetPribory> {

    public void create(OsvetPribory obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(OsvetPribory obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(OsvetPribory obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public OsvetPribory findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(OsvetPribory.class, id);
    }

    public List<OsvetPribory> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<OsvetPribory> osvetPribory = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From OsvetPribory").list();
	return osvetPribory;
    }

}
