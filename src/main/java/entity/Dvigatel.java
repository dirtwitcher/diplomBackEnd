package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dvigatel")
public class Dvigatel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dvigatel;

    // @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "id_auto")
    // private Auto id_auto;

    @Column(name = "obem")
    private Double obem;

    @Column(name = "garantiya", length = 25)
    private String garantiya;

    @Column(name = "dopComment", length = 250)
    private String dopComment;

    @Column(name = "foto")
    // @Lob(type = LobType.BLOB)
    private byte[] image;

    @Column(name = "cena")
    private Double cena;

    public Dvigatel() {
    }

    public int getId_dvigatel() {
	return id_dvigatel;
    }

//    public void setId_dvigatel(int id_dvigatel) {
//	this.id_dvigatel = id_dvigatel;
//    }
    /*
     * public Auto getId_auto() { return id_auto; }
     * 
     * public void setId_auto(Auto id_auto) { this.id_auto = id_auto; }
     */
    public Double getObem() {
	return obem;
    }

    public void setObem(Double obem) {
	this.obem = obem;
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
	return "Dvigatel [id_dvigatel=" + id_dvigatel + ", obem=" + obem + ", garantiya=" + garantiya + ", dopComment="
		+ dopComment + "]";
    }

}
