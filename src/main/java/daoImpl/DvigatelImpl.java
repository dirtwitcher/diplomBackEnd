package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.Dvigatel;

public class DvigatelImpl implements CrudInterface<Dvigatel> {

    public void create(Dvigatel obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(Dvigatel obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(Dvigatel obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public Dvigatel findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(Dvigatel.class, id);
    }

    public List<Dvigatel> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<Dvigatel> dvigatel = HibernateSessionFactory.getSessionFactory().openSession().createQuery("From Dvigatel")
		.list();
	return dvigatel;
    }

}
