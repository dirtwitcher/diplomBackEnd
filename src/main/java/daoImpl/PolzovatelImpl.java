package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.Polzovatel;

public class PolzovatelImpl implements CrudInterface<Polzovatel> {

    public void create(Polzovatel obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(Polzovatel obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(Polzovatel obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public Polzovatel findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(Polzovatel.class, id);
    }

    public List<Polzovatel> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<Polzovatel> polzovatel = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From Polzovatel").list();
	return polzovatel;
    }

}
