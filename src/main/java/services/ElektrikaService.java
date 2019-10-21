package services;

import java.util.List;

import daoImpl.ElektrikaImpl;
import entity.Elektrika;

public class ElektrikaService {

    private ElektrikaImpl elektrikaImpl = new ElektrikaImpl();

    public ElektrikaService() {
    }

    public void createElektrika(Elektrika obj) {
	elektrikaImpl.create(obj);
    }

    public void updateElektrika(Elektrika obj) {
	elektrikaImpl.update(obj);
    }

    public void deleteElektrika(Elektrika obj) {
	elektrikaImpl.delete(obj);
    }

    public Elektrika findElektrika(int id) {
	return elektrikaImpl.findById(id);
    }

    public List<Elektrika> findAllElektrika() {
	return elektrikaImpl.findAll();
    }

}
