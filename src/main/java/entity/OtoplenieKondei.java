package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "otoplenieKondei")
public class OtoplenieKondei {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_otoplenieKondei;

    // @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "id_auto")
    // private Auto id_auto;

    @Column(name = "typeDetali", length = 120)
    private String typeDetali;

    @Column(name = "material", length = 35)
    private String material;

    @Column(name = "proizvoditel", length = 30)
    private String proizvoditel;

    @Column(name = "garantiya", length = 25)
    private String garantiya;

    @Column(name = "dopComment", length = 250)
    private String dopComment;

    @Column(name = "foto")
    // @Lob(type = LobType.BLOB)
    private byte[] image;

    public OtoplenieKondei() {
    }

    public int getId_otoplenieKondei() {
	return id_otoplenieKondei;
    }

//    public void setId_otoplenieKondei(int id_otoplenieKondei) {
//	this.id_otoplenieKondei = id_otoplenieKondei;
//    }
    /*
     * public Auto getId_auto() { return id_auto; }
     * 
     * public void setId_auto(Auto id_auto) { this.id_auto = id_auto; }
     */
    public String getTypeDetali() {
	return typeDetali;
    }

    public void setTypeDetali(String typeDetali) {
	this.typeDetali = typeDetali;
    }

    public String getMaterial() {
	return material;
    }

    public void setMaterial(String material) {
	this.material = material;
    }

    public String getProizvoditel() {
	return proizvoditel;
    }

    public void setProizvoditel(String proizvoditel) {
	this.proizvoditel = proizvoditel;
    }

    public String getGarantiya() {
	return garantiya;
    }

    public void setGarantiya(String garantiya) {
	this.garantiya = garantiya;
    }

    public String getDopComment() {
	return dopComment;
    }

    public void setDopComment(String dopComment) {
	this.dopComment = dopComment;
    }

    public byte[] getImage() {
	return image;
    }

    public void setImage(byte[] image) {
	this.image = image;
    }

    @Override
    public String toString() {
	return "OtoplenieKondei [id_otoplenieKondei=" + id_otoplenieKondei + ", typeDetali=" + typeDetali
		+ ", material=" + material + ", proizvoditel=" + proizvoditel + ", garantiya=" + garantiya
		+ ", dopComment=" + dopComment + "]";
    }

}
