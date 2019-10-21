package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.Transmissiya;

public class TransmissiyaImpl implements CrudInterface<Transmissiya> {

    public void create(Transmissiya obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(Transmissiya obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(Transmissiya obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public Transmissiya findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(Transmissiya.class, id);
    }

    public List<Transmissiya> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<Transmissiya> transmissiya = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From Transmissiya").list();
	return transmissiya;
    }

}
