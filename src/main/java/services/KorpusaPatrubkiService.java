package services;

import java.util.List;

import daoImpl.KorpusaPatrubkiImpl;
import entity.KorpusaPatrubki;

public class KorpusaPatrubkiService {

    private KorpusaPatrubkiImpl korpusaPatrubkiImpl = new KorpusaPatrubkiImpl();

    public KorpusaPatrubkiService() {
    }

    public void createKorpusaPatrubki(KorpusaPatrubki obj) {
	korpusaPatrubkiImpl.create(obj);
    }

    public void updateKorpusaPatrubki(KorpusaPatrubki obj) {
	korpusaPatrubkiImpl.update(obj);
    }

    public void deleteKorpusaPatrubki(KorpusaPatrubki obj) {
	korpusaPatrubkiImpl.delete(obj);
    }

    public KorpusaPatrubki findKorpusaPatrubki(int id) {
	return korpusaPatrubkiImpl.findById(id);
    }

    public List<KorpusaPatrubki> findAllKorpusaPatrubki() {
	return korpusaPatrubkiImpl.findAll();
    }

}
