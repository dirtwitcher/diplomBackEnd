package services;

import java.util.List;

import daoImpl.DvigatelImpl;
import entity.Dvigatel;

public class DvigatelService {

    private DvigatelImpl dvigatelImpl = new DvigatelImpl();

    public DvigatelService() {
    }

    public void createDvigatel(Dvigatel obj) {
	dvigatelImpl.create(obj);
    }

    public void updateDvigatel(Dvigatel obj) {
	dvigatelImpl.update(obj);
    }

    public void deleteDvigatel(Dvigatel obj) {
	dvigatelImpl.delete(obj);
    }

    public Dvigatel findDvigatel(int id) {
	return dvigatelImpl.findById(id);
    }

    public List<Dvigatel> findAllDvigatel() {
	return dvigatelImpl.findAll();
    }

}
