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
@Table(name = "transmissiya")
public class Transmissiya {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_transmissiya;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_auto")
    private Auto id_auto;

    @Column(name = "typeDetali", length = 120)
    private String typeDetali;

    @Column(name = "garantiya", length = 25)
    private String garantiya;

    @Column(name = "dopComment", length = 250)
    private String dopComment;

    @Column(name = "foto")
    // @Lob(type = LobType.BLOB)
    private byte[] image;

    public Transmissiya() {
    }

    public int getId_transmissiya() {
	return id_transmissiya;
    }

    public void setId_transmissiya(int id_transmissiya) {
	this.id_transmissiya = id_transmissiya;
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
	return "Transmissiya [id_transmissiya=" + id_transmissiya + ", typeDetali=" + typeDetali + ", garantiya="
		+ garantiya + ", dopComment=" + dopComment + "]";
    }

}
