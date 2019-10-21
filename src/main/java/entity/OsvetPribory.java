package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "osvetPribory")
public class OsvetPribory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_osvetPribory;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_auto")
    private Auto id_auto;

    @Column(name = "typeDetali", length = 120)
    private String typeDetali;

    @Column(name = "storona", length = 35)
    private String storona;

    @Column(name = "proizvoditel", length = 30)
    private String proizvoditel;

    @Column(name = "garantiya", length = 25)
    private String garantiya;

    @Column(name = "dopComment", length = 250)
    private String dopComment;

    @Column(name = "foto")
    // @Lob(type = LobType.BLOB)
    private byte[] image;

    public OsvetPribory() {
    }

    public int getId_osvetPribory() {
	return id_osvetPribory;
    }

    public void setId_osvetPribory(int id_osvetPribory) {
	this.id_osvetPribory = id_osvetPribory;
    }

    public Auto getId_auto() {
	return id_auto;
    }

    public void setId_auto(Auto id_auto) {
	this.id_auto = id_auto;
    }

    public String getTypeDetali() {
	return typeDetali;
    }

    public void setTypeDetali(String typeDetali) {
	this.typeDetali = typeDetali;
    }

    public String getStorona() {
	return storona;
    }

    public void setStorona(String storona) {
	this.storona = storona;
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
	return "OsvetPribory [id_osvetPribory=" + id_osvetPribory + ", typeDetali=" + typeDetali + ", storona="
		+ storona + ", proizvoditel=" + proizvoditel + ", garantiya=" + garantiya + ", dopComment=" + dopComment
		+ "]";
    }

}
