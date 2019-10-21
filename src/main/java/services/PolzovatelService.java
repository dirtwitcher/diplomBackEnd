package services;

import java.util.List;

import daoImpl.PolzovatelImpl;
import entity.Polzovatel;

public class PolzovatelService {

    private PolzovatelImpl polzovatelImpl = new PolzovatelImpl();

    public PolzovatelService() {
    }

    public void createPolzovatel(Polzovatel obj) {
	polzovatelImpl.create(obj);
    }

    public void updatePolzovatel(Polzovatel obj) {
	polzovatelImpl.update(obj);
    }

    public void deletePolzovatel(Polzovatel obj) {
	polzovatelImpl.delete(obj);
    }

    public Polzovatel findPolzovatel(int id) {
	return polzovatelImpl.findById(id);
    }

    public List<Polzovatel> findAllPolzovatel() {
	return polzovatelImpl.findAll();
    }

}
