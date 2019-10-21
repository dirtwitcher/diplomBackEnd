package services;

import java.util.List;

import daoImpl.JurnalImpl;
import entity.Jurnal;

public class JurnalService {

    private JurnalImpl jurnalImpl = new JurnalImpl();

    public JurnalService() {
    }

    public void createJurnal(Jurnal obj) {
	jurnalImpl.create(obj);
    }

    public void updateJurnal(Jurnal obj) {
	jurnalImpl.update(obj);
    }

    public void deleteJurnal(Jurnal obj) {
	jurnalImpl.delete(obj);
    }

    public Jurnal findJurnal(int id) {
	return jurnalImpl.findById(id);
    }

    public List<Jurnal> findAllJurnal() {
	return jurnalImpl.findAll();
    }

}
