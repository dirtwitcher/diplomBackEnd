package services;

import java.util.List;

import daoImpl.PodveskaImpl;
import entity.Podveska;

public class PodveskaService {

    private PodveskaImpl podveskaImpl = new PodveskaImpl();

    public PodveskaService() {
    }

    public void createPodveska(Podveska obj) {
	podveskaImpl.create(obj);
    }

    public void updatePodveska(Podveska obj) {
	podveskaImpl.update(obj);
    }

    public void deletePodveska(Podveska obj) {
	podveskaImpl.delete(obj);
    }

    public Podveska findPodveska(int id) {
	return podveskaImpl.findById(id);
    }

    public List<Podveska> findAllPodveska() {
	return podveskaImpl.findAll();
    }

}
