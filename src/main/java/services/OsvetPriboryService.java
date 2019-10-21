package services;

import java.util.List;

import daoImpl.OsvetPriboryImpl;
import entity.OsvetPribory;

public class OsvetPriboryService {

    private OsvetPriboryImpl osvetPriboryImpl = new OsvetPriboryImpl();

    public OsvetPriboryService() {
    }

    public void createOsvetPribory(OsvetPribory obj) {
	osvetPriboryImpl.create(obj);
    }

    public void updateOsvetPribory(OsvetPribory obj) {
	osvetPriboryImpl.update(obj);
    }

    public void deleteOsvetPribory(OsvetPribory obj) {
	osvetPriboryImpl.delete(obj);
    }

    public OsvetPribory findOsvetPribory(int id) {
	return osvetPriboryImpl.findById(id);
    }

    public List<OsvetPribory> findAllOsvetPribory() {
	return osvetPriboryImpl.findAll();
    }

}
