package services;

import java.util.List;

import daoImpl.SistemaOhlajdeniyaImpl;
import entity.SistemaOhlajdeniya;

public class SistemaOhlajdeniyaService {

    private SistemaOhlajdeniyaImpl sistemaOhlajdeniyaImpl = new SistemaOhlajdeniyaImpl();

    public SistemaOhlajdeniyaService() {
    }

    public void createSistemaOhlajdeniya(SistemaOhlajdeniya obj) {
	sistemaOhlajdeniyaImpl.create(obj);
    }

    public void updateSistemaOhlajdeniya(SistemaOhlajdeniya obj) {
	sistemaOhlajdeniyaImpl.update(obj);
    }

    public void deleteSistemaOhlajdeniya(SistemaOhlajdeniya obj) {
	sistemaOhlajdeniyaImpl.delete(obj);
    }

    public SistemaOhlajdeniya findSistemaOhlajdeniya(int id) {
	return sistemaOhlajdeniyaImpl.findById(id);
    }

    public List<SistemaOhlajdeniya> findAllSistemaOhlajdeniya() {
	return sistemaOhlajdeniyaImpl.findAll();
    }

}
