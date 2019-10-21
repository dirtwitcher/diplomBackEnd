package services;

import java.util.List;

import daoImpl.TypeAutoImpl;
import entity.TypeAuto;

public class TypeAutoService {

    private TypeAutoImpl typeAutoImpl = new TypeAutoImpl();

    public TypeAutoService() {
    }

    public void createTypeAuto(TypeAuto obj) {
	typeAutoImpl.create(obj);
    }

    public void updateTypeAuto(TypeAuto obj) {
	typeAutoImpl.update(obj);
    }

    public void deleteTypeAuto(TypeAuto obj) {
	typeAutoImpl.delete(obj);
    }

    public TypeAuto findTypeAuto(int id) {
	return typeAutoImpl.findById(id);
    }

    public List<TypeAuto> findAllTypeAuto() {
	return typeAutoImpl.findAll();
    }

}
