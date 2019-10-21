package services;

import java.util.List;

import daoImpl.ToplivnayaSistemaImpl;
import entity.ToplivnayaSistema;

public class ToplivnayaSistemaService {

    private ToplivnayaSistemaImpl toplivnayaSistemaImpl = new ToplivnayaSistemaImpl();

    public ToplivnayaSistemaService() {
    }

    public void createToplivnayaSistema(ToplivnayaSistema obj) {
	toplivnayaSistemaImpl.create(obj);
    }

    public void updateToplivnayaSistema(ToplivnayaSistema obj) {
	toplivnayaSistemaImpl.update(obj);
    }

    public void deleteToplivnayaSistema(ToplivnayaSistema obj) {
	toplivnayaSistemaImpl.delete(obj);
    }

    public ToplivnayaSistema findToplivnayaSistema(int id) {
	return toplivnayaSistemaImpl.findById(id);
    }

    public List<ToplivnayaSistema> findAllToplivnayaSistema() {
	return toplivnayaSistemaImpl.findAll();
    }

}
