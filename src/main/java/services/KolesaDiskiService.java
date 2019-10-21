package services;

import java.util.List;

import daoImpl.KolesaDiskiImpl;
import entity.KolesaDiski;

public class KolesaDiskiService {

    private KolesaDiskiImpl kolesaDiskiImpl = new KolesaDiskiImpl();

    public KolesaDiskiService() {
    }

    public void createKolesaDiski(KolesaDiski obj) {
	kolesaDiskiImpl.create(obj);
    }

    public void updateKolesaDiski(KolesaDiski obj) {
	kolesaDiskiImpl.update(obj);
    }

    public void deleteKolesaDiski(KolesaDiski obj) {
	kolesaDiskiImpl.delete(obj);
    }

    public KolesaDiski findKolesaDiski(int id) {
	return kolesaDiskiImpl.findById(id);
    }

    public List<KolesaDiski> findAllKolesaDiski() {
	return kolesaDiskiImpl.findAll();
    }

}
