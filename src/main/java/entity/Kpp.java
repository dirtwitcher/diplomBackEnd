package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kpp")
public class Kpp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_kpp;

    // @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "id_auto")
    // private Auto id_auto;

    @Column(name = "typeDetali", length = 120)
    private String typeDetali;

    @Column(name = "kolvoStupeney")
    private int kolvoStupeney;

    @Column(name = "garantiya", length = 25)
    private int garantiya;

    @Column(name = "dopComment", length = 250)
    private String dopComment;

    @Column(name = "foto")
    // @Lob(type = LobType.BLOB)
    private byte[] image;

    public Kpp() {
    }

    public int getId_kpp() {
	return id_kpp;
    }

//    public void setId_kpp(int id_kpp) {
//	this.id_kpp = id_kpp;
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

    public int getKolvoStupeney() {
	return kolvoStupeney;
    }

    public void setKolvoStupeney(int kolvoStupeney) {
	this.kolvoStupeney = kolvoStupeney;
    }

    public int getGarantiya() {
	return garantiya;
    }

    public void setGarantiya(int garantiya) {
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
	return "Kpp [id_kpp=" + id_kpp + ", typeDetali=" + typeDetali + ", kolvoStupeney=" + kolvoStupeney
		+ ", garantiya=" + garantiya + ", dopComment=" + dopComment + "]";
    }

}
