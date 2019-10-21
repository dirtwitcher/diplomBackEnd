package services;

import java.util.List;

import daoImpl.OtoplenieKondeiImpl;
import entity.OtoplenieKondei;

public class OtoplenieKondeiService {

    private OtoplenieKondeiImpl otoplenieKondeiImpl = new OtoplenieKondeiImpl();

    public OtoplenieKondeiService() {
    }

    public void createOtoplenieKondei(OtoplenieKondei obj) {
	otoplenieKondeiImpl.create(obj);
    }

    public void updateOtoplenieKondei(OtoplenieKondei obj) {
	otoplenieKondeiImpl.update(obj);
    }

    public void deleteOtoplenieKondei(OtoplenieKondei obj) {
	otoplenieKondeiImpl.delete(obj);
    }

    public OtoplenieKondei findOtoplenieKondei(int id) {
	return otoplenieKondeiImpl.findById(id);
    }

    public List<OtoplenieKondei> findAllOtoplenieKondei() {
	return otoplenieKondeiImpl.findAll();
    }

}
