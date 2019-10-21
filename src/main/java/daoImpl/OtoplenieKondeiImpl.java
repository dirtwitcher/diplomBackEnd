package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.OtoplenieKondei;

public class OtoplenieKondeiImpl implements CrudInterface<OtoplenieKondei> {

    public void create(OtoplenieKondei obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(OtoplenieKondei obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(OtoplenieKondei obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public OtoplenieKondei findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(OtoplenieKondei.class, id);
    }

    public List<OtoplenieKondei> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<OtoplenieKondei> otoplenieKondei = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From OtoplenieKondei").list();
	return otoplenieKondei;
    }

}
