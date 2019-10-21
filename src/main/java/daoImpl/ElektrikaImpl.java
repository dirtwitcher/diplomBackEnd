package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.Elektrika;

public class ElektrikaImpl implements CrudInterface<Elektrika> {

    public void create(Elektrika obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(Elektrika obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(Elektrika obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public Elektrika findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(Elektrika.class, id);
    }

    public List<Elektrika> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<Elektrika> elektrika = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From Elektrika").list();
	return elektrika;
    }

}
