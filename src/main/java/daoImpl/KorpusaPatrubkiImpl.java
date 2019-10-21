package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.KorpusaPatrubki;

public class KorpusaPatrubkiImpl implements CrudInterface<KorpusaPatrubki> {

    public void create(KorpusaPatrubki obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(KorpusaPatrubki obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(KorpusaPatrubki obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public KorpusaPatrubki findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(KorpusaPatrubki.class, id);
    }

    public List<KorpusaPatrubki> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<KorpusaPatrubki> korpusaPatrubki = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From KorpusaPatrubki").list();
	return korpusaPatrubki;
    }

}
