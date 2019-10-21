package services;

import java.util.List;

import daoImpl.AutoImpl;
import entity.Auto;

public class AutoService {

    private AutoImpl autoImpl = new AutoImpl();

    public AutoService() {
    }

    public void createAuto(Auto obj) {
	autoImpl.create(obj);
    }

    public void updateAuto(Auto obj) {
	autoImpl.update(obj);
    }

    public void deleteAuto(Auto obj) {
	autoImpl.delete(obj);
    }

    public Auto findAuto(int id) {
	return autoImpl.findById(id);
    }

    public List<Auto> findAllAuto() {
	return autoImpl.findAll();
    }

}
