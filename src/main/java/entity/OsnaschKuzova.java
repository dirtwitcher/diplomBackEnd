package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "osnaschKuzova")
public class OsnaschKuzova {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_osnaschKuzova;

    // @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "id_auto")
    // private Auto id_auto;

    @Column(name = "typeDetali", length = 120)
    private String typeDetali;

    @Column(name = "storona", length = 35)
    private String storona;

    @Column(name = "garantiya", length = 25)
    private String garantiya;

    @Column(name = "dopComment", length = 250)
    private String dopComment;

    @Column(name = "foto")
    // @Lob(type = LobType.BLOB)
    private byte[] image;

    @Column(name = "cena")
    private Double cena;

    public OsnaschKuzova() {
    }

    public int getId_osnaschKuzova() {
	return id_osnaschKuzova;
    }

//    public void setId_osnaschKuzova(int id_osnaschKuzova) {
//	this.id_osnaschKuzova = id_osnaschKuzova;
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

    public Double getCena() {
	return cena;
    }

    public void setCena(Double cena) {
	this.cena = cena;
    }

    @Override
    public String toString() {
	return "OsnaschKuzova [id_osnaschKuzova=" + id_osnaschKuzova + ", typeDetali=" + typeDetali + ", storona="
		+ storona + ", garantiya=" + garantiya + ", dopComment=" + dopComment + "]";
    }

}
