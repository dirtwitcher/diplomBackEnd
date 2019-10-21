package services;

import java.util.List;

import daoImpl.KppImpl;
import entity.Kpp;

public class KppService {

    private KppImpl kppImpl = new KppImpl();

    public KppService() {
    }

    public void createKpp(Kpp obj) {
	kppImpl.create(obj);
    }

    public void updateKpp(Kpp obj) {
	kppImpl.update(obj);
    }

    public void deleteKpp(Kpp obj) {
	kppImpl.delete(obj);
    }

    public Kpp findKpp(int id) {
	return kppImpl.findById(id);
    }

    public List<Kpp> findAllKpp() {
	return kppImpl.findAll();
    }

}
