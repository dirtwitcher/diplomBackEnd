package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.KuzovnieDetali;

public class KuzovnieDetaliImpl implements CrudInterface<KuzovnieDetali> {

    public void create(KuzovnieDetali obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(KuzovnieDetali obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(KuzovnieDetali obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public KuzovnieDetali findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(KuzovnieDetali.class, id);
    }

    public List<KuzovnieDetali> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<KuzovnieDetali> kuzovnieDetali = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From KuzovnieDetali").list();
	return kuzovnieDetali;
    }

}
