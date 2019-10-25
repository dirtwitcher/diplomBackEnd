package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "toplivnayaSistema")
public class ToplivnayaSistema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_toplivnayaSistema;

    // @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "id_auto")
    // private Auto id_auto;

    @Column(name = "typeDetali", length = 120)
    private String typeDetali;

    @Column(name = "proizvoditel", length = 30)
    private String proizvoditel;

    @Column(name = "garantiya", length = 25)
    private String garantiya;

    @Column(name = "dopComment", length = 250)
    private String dopComment;

    @Column(name = "foto")
    // @Lob(type = LobType.BLOB)
    private byte[] image;

    public ToplivnayaSistema() {
    }

    public int getId_toplivnayaSistema() {
	return id_toplivnayaSistema;
    }

//    public void setId_toplivnayaSistema(int id_toplivnayaSistema) {
//	this.id_toplivnayaSistema = id_toplivnayaSistema;
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
	return "ToplivnayaSistema [id_toplivnayaSistema=" + id_toplivnayaSistema + ", typeDetali=" + typeDetali
		+ ", proizvoditel=" + proizvoditel + ", garantiya=" + garantiya + ", dopComment=" + dopComment + "]";
    }

}
