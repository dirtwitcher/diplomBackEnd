package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "podveska")
public class Podveska {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_podveska;

    // @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "id_auto")
    // private Auto id_auto;

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

    @Column(name = "cena")
    private Double cena;

    public Podveska() {
    }

    public int getId_podveska() {
	return id_podveska;
    }

//    public void setId_podveska(int id_podveska) {
//	this.id_podveska = id_podveska;
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

    public Double getCena() {
	return cena;
    }

    public void setCena(Double cena) {
	this.cena = cena;
    }

    @Override
    public String toString() {
	return "Podveska [id_podveska=" + id_podveska + ", typeDetali=" + typeDetali + ", storona=" + storona
		+ ", proizvoditel=" + proizvoditel + ", garantiya=" + garantiya + ", dopComment=" + dopComment + "]";
    }

}
