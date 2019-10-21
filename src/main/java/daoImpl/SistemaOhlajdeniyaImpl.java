package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.SistemaOhlajdeniya;

public class SistemaOhlajdeniyaImpl implements CrudInterface<SistemaOhlajdeniya> {

    public void create(SistemaOhlajdeniya obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(SistemaOhlajdeniya obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(SistemaOhlajdeniya obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public SistemaOhlajdeniya findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(SistemaOhlajdeniya.class, id);
    }

    public List<SistemaOhlajdeniya> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<SistemaOhlajdeniya> sistemaOhlajdeniya = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From SistemaOhlajdeniya").list();
	return sistemaOhlajdeniya;
    }

}
