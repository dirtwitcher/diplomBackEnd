package services;

import java.util.List;

import daoImpl.KuzovnieDetaliImpl;
import entity.KuzovnieDetali;

public class KuzovnieDetaliService {

    private KuzovnieDetaliImpl kuzovnieDetaliImpl = new KuzovnieDetaliImpl();

    public KuzovnieDetaliService() {
    }

    public void createKuzovnieDetali(KuzovnieDetali obj) {
	kuzovnieDetaliImpl.create(obj);
    }

    public void updateKuzovnieDetali(KuzovnieDetali obj) {
	kuzovnieDetaliImpl.update(obj);
    }

    public void deleteKuzovnieDetali(KuzovnieDetali obj) {
	kuzovnieDetaliImpl.delete(obj);
    }

    public KuzovnieDetali findKuzovnieDetali(int id) {
	return kuzovnieDetaliImpl.findById(id);
    }

    public List<KuzovnieDetali> findAllKuzovnieDetali() {
	return kuzovnieDetaliImpl.findAll();
    }

}
