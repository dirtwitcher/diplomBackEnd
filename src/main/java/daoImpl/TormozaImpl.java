package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.Tormoza;

public class TormozaImpl implements CrudInterface<Tormoza> {

    public void create(Tormoza obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(Tormoza obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(Tormoza obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public Tormoza findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(Tormoza.class, id);
    }

    public List<Tormoza> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<Tormoza> tormoza = HibernateSessionFactory.getSessionFactory().openSession().createQuery("From Tormoza")
		.list();
	return tormoza;
    }

}
