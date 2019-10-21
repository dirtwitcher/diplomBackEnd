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
@Table(name = "kuzovnieDetali")
public class KuzovnieDetali {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_kuzovnieDetali;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_auto")
    private Auto id_auto;

    @Column(name = "typeDetali", length = 120)
    private String typeDetali;

    @Column(name = "kuzov", length = 25)
    private String kuzov;

    @Column(name = "cvetDetali", length = 30)
    private String cvetDetali;

    @Column(name = "storona", length = 35)
    private String storona;

    @Column(name = "garantiya", length = 25)
    private String garantiya;

    @Column(name = "dopComment", length = 250)
    private String dopComment;

    @Column(name = "foto")
    // @Lob(type = LobType.BLOB)
    private byte[] image;

    public KuzovnieDetali() {
    }

    public int getId_kuzovnieDetali() {
	return id_kuzovnieDetali;
    }

    public void setId_kuzovnieDetali(int id_kuzovnieDetali) {
	this.id_kuzovnieDetali = id_kuzovnieDetali;
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

    public String getKuzov() {
	return kuzov;
    }

    public void setKuzov(String kuzov) {
	this.kuzov = kuzov;
    }

    public String getCvetDetali() {
	return cvetDetali;
    }

    public void setCvetDetali(String cvetDetali) {
	this.cvetDetali = cvetDetali;
    }

    public String getStorona() {
	return storona;
    }

    public void setStorona(String storona) {
	this.storona = storona;
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
	return "KuzovnieDetali [id_kuzovnieDetali=" + id_kuzovnieDetali + ", typeDetali=" + typeDetali + ", kuzov="
		+ kuzov + ", cvetDetali=" + cvetDetali + ", storona=" + storona + ", garantiya=" + garantiya
		+ ", dopComment=" + dopComment + "]";
    }

}
