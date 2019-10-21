package daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import app.HibernateSessionFactory;
import dao.CrudInterface;
import entity.TypeAuto;

public class TypeAutoImpl implements CrudInterface<TypeAuto> {

    public void create(TypeAuto obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.save(obj);
	transaction.commit();
	session.close();
    }

    public void update(TypeAuto obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.update(obj);
	transaction.commit();
	session.close();
    }

    public void delete(TypeAuto obj) {
	// TODO Auto-generated method stub
	Session session = HibernateSessionFactory.getSessionFactory().openSession();
	Transaction transaction = session.beginTransaction();
	session.delete(obj);
	transaction.commit();
	session.close();
    }

    public TypeAuto findById(int id) {
	// TODO Auto-generated method stub
	return HibernateSessionFactory.getSessionFactory().openSession().get(TypeAuto.class, id);
    }

    public List<TypeAuto> findAll() {
	// TODO Auto-generated method stub
	@SuppressWarnings("unchecked")
	List<TypeAuto> typeAuto = HibernateSessionFactory.getSessionFactory().openSession().createQuery("From TypeAuto")
		.list();
	return typeAuto;
    }

}
