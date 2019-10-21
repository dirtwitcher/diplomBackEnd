package services;

import java.util.List;

import daoImpl.RulevoeUpravlenieImpl;
import entity.RulevoeUpravlenie;

public class RulevoeUpravlenieService {

    private RulevoeUpravlenieImpl rulevoeUpravlenieImpl = new RulevoeUpravlenieImpl();

    public RulevoeUpravlenieService() {
    }

    public void createRulevoeUpravlenie(RulevoeUpravlenie obj) {
	rulevoeUpravlenieImpl.create(obj);
    }

    public void updateRulevoeUpravlenie(RulevoeUpravlenie obj) {
	rulevoeUpravlenieImpl.update(obj);
    }

    public void deleteRulevoeUpravlenie(RulevoeUpravlenie obj) {
	rulevoeUpravlenieImpl.delete(obj);
    }

    public RulevoeUpravlenie findRulevoeUpravlenie(int id) {
	return rulevoeUpravlenieImpl.findById(id);
    }

    public List<RulevoeUpravlenie> findAllRulevoeUpravlenie() {
	return rulevoeUpravlenieImpl.findAll();
    }

}
