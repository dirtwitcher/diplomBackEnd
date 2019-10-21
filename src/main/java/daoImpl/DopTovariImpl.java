package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.DopTovari;

public class DopTovariImpl implements CrudInterface<DopTovari> {

    public void create(DopTovari obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(DopTovari obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(DopTovari obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public DopTovari findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(DopTovari.class, id);
    }

    public List<DopTovari> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<DopTovari> dopTovari = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From DopTovari").list();
	return dopTovari;
    }

}
