package services;

import java.util.List;

import daoImpl.OsnaschKuzovaImpl;
import entity.OsnaschKuzova;

public class OsnaschKuzovaService {

    private OsnaschKuzovaImpl osnaschKuzovaImpl = new OsnaschKuzovaImpl();

    public OsnaschKuzovaService() {
    }

    public void createOsnaschKuzova(OsnaschKuzova obj) {
	osnaschKuzovaImpl.create(obj);
    }

    public void updateOsnaschKuzova(OsnaschKuzova obj) {
	osnaschKuzovaImpl.update(obj);
    }

    public void deleteOsnaschKuzova(OsnaschKuzova obj) {
	osnaschKuzovaImpl.delete(obj);
    }

    public OsnaschKuzova findOsnaschKuzova(int id) {
	return osnaschKuzovaImpl.findById(id);
    }

    public List<OsnaschKuzova> findAllOsnaschKuzova() {
	return osnaschKuzovaImpl.findAll();
    }

}
