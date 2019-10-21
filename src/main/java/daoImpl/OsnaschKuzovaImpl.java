package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.OsnaschKuzova;

public class OsnaschKuzovaImpl implements CrudInterface<OsnaschKuzova> {

    public void create(OsnaschKuzova obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(OsnaschKuzova obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(OsnaschKuzova obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public OsnaschKuzova findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(OsnaschKuzova.class, id);
    }

    public List<OsnaschKuzova> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<OsnaschKuzova> osnaschKuzova = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From OsnaschKuzova").list();
	return osnaschKuzova;
    }

}
