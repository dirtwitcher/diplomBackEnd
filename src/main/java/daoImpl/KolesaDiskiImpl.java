package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.KolesaDiski;

public class KolesaDiskiImpl implements CrudInterface<KolesaDiski> {

    public void create(KolesaDiski obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(KolesaDiski obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(KolesaDiski obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public KolesaDiski findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(KolesaDiski.class, id);
    }

    public List<KolesaDiski> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<KolesaDiski> kolesaDiski = HibernateSessionFactory.getSessionFactory().openSession()
		.createQuery("From KolesaDiski").list();
	return kolesaDiski;
    }

}
