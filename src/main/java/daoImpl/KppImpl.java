package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.Kpp;

public class KppImpl implements CrudInterface<Kpp> {

    public void create(Kpp obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(Kpp obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(Kpp obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public Kpp findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(Kpp.class, id);
    }

    public List<Kpp> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<Kpp> kpp = HibernateSessionFactory.getSessionFactory().openSession().createQuery("From Kpp").list();
	return kpp;
    }

}
