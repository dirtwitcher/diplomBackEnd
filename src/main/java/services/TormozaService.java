package services;

import java.util.List;

import daoImpl.TormozaImpl;
import entity.Tormoza;

public class TormozaService {

    private TormozaImpl tormozaImpl = new TormozaImpl();

    public TormozaService() {
    }

    public void createTormoza(Tormoza obj) {
	tormozaImpl.create(obj);
    }

    public void updateTormoza(Tormoza obj) {
	tormozaImpl.update(obj);
    }

    public void deleteTormoza(Tormoza obj) {
	tormozaImpl.delete(obj);
    }

    public Tormoza findTormoza(int id) {
	return tormozaImpl.findById(id);
    }

    public List<Tormoza> findAllTormoza() {
	return tormozaImpl.findAll();
    }

}
