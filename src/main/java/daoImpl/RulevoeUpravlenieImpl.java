package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.RulevoeUpravlenie;

public class RulevoeUpravlenieImpl implements CrudInterface<RulevoeUpravlenie> {

    public void create(RulevoeUpravlenie obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(RulevoeUpravlenie obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(RulevoeUpravlenie obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public RulevoeUpravlenie findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(RulevoeUpravlenie.class, id);
    }

    public List<RulevoeUpravlenie> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<RulevoeUpravlenie> rulevoeUpravlenie = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From RulevoeUpravlenie").list();
	return rulevoeUpravlenie;
    }

}
