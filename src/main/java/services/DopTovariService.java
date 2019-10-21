package services;

import java.util.List;

import daoImpl.DopTovariImpl;
import entity.DopTovari;

public class DopTovariService {

    private DopTovariImpl dopTovariImpl = new DopTovariImpl();

    public DopTovariService() {
    }

    public void createDopTovari(DopTovari obj) {
	dopTovariImpl.create(obj);
    }

    public void updateDopTovari(DopTovari obj) {
	dopTovariImpl.update(obj);
    }

    public void deleteDopTovari(DopTovari obj) {
	dopTovariImpl.delete(obj);
    }

    public DopTovari findDopTovari(int id) {
	return dopTovariImpl.findById(id);
    }

    public List<DopTovari> findAllDopTovari() {
	return dopTovariImpl.findAll();
    }

}
