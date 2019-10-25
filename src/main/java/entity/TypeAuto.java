package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "typeAuto")
public class TypeAuto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_typeAuto;

    @Column(name = "marka", length = 25)
    private String marka;

    @Column(name = "model", length = 25)
    private String model;

    // @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_typeAuto", cascade =
    // CascadeType.ALL)
    // private List<Auto> autoList;

    public TypeAuto() {
    }

    public int getId_typeAuto() {
	return id_typeAuto;
    }

//    public void setId_typeAuto(int id_typeAuto) {
//	this.id_typeAuto = id_typeAuto;
//    }

    public String getMarka() {
	return marka;
    }

    public void setMarka(String marka) {
	this.marka = marka;
    }

    public String getModel() {
	return model;
    }

    public void setModel(String model) {
	this.model = model;
    }

    /*
     * public List<Auto> getAutoList() { return autoList; }
     * 
     * public void setAutoList(List<Auto> autoList) { this.autoList = autoList; }
     */

    @Override
    public String toString() {
	return "TypeAuto [id_typeAuto=" + id_typeAuto + ", marka=" + marka + ", model=" + model + "]";
    }

}
