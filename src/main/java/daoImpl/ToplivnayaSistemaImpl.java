package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.ToplivnayaSistema;

public class ToplivnayaSistemaImpl implements CrudInterface<ToplivnayaSistema> {

    public void create(ToplivnayaSistema obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(ToplivnayaSistema obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(ToplivnayaSistema obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public ToplivnayaSistema findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(ToplivnayaSistema.class, id);
    }

    public List<ToplivnayaSistema> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<ToplivnayaSistema> toplivnayaSistema = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From ToplivnayaSistema").list();
	return toplivnayaSistema;
    }

}
