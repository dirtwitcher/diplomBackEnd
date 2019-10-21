package services;

import java.util.List;

import daoImpl.TransmissiyaImpl;
import entity.Transmissiya;

public class TransmissiyaService {

    private TransmissiyaImpl transmissiyaImpl = new TransmissiyaImpl();

    public TransmissiyaService() {
    }

    public void createTransmissiya(Transmissiya obj) {
	transmissiyaImpl.create(obj);
    }

    public void updateTransmissiya(Transmissiya obj) {
	transmissiyaImpl.update(obj);
    }

    public void deleteTransmissiya(Transmissiya obj) {
	transmissiyaImpl.delete(obj);
    }

    public Transmissiya findTransmissiya(int id) {
	return transmissiyaImpl.findById(id);
    }

    public List<Transmissiya> findAllTransmissiya() {
	return transmissiyaImpl.findAll();
    }

}
