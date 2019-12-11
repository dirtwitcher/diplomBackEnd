package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kolesaDiski")
public class KolesaDiski {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_kolesaDiski;

    @Column(name = "typeDetali", length = 120)
    private String typeDetali;

    @Column(name = "typeDiska", length = 35)
    private String typeDiska;

    @Column(name = "PCD", length = 15)
    private String PCD;

    @Column(name = "kolvoOtversti")
    private int kolvoOtversti;

    @Column(name = "diametrStupOtverstia")
    private int diametrStupOtverstia;

    @Column(name = "diametr")
    private int diametr;

    @Column(name = "firmaModel", length = 35)
    private String firmaModel;

    @Column(name = "sezon", length = 25)
    private String sezon;

    @Column(name = "shirina")
    private int shirina;

    @Column(name = "visota")
    private int visota;

    @Column(name = "indexNagruzki")
    private int indexNagruzki;

    @Column(name = "indexSkorosti", length = 5)
    private String indexSkorosti;

    @Column(name = "garantiya", length = 25)
    private String garantiya;

    @Column(name = "dopComment", length = 250)
    private String dopComment;

    @Column(name = "foto")
    // @Lob(type = LobType.BLOB)
    private byte[] image;

    @Column(name = "cena")
    private Double cena;

    public KolesaDiski() {
    }

    public int getId_kolesaDiski() {
	return id_kolesaDiski;
    }

//    public void setId_kolesaDiski(int id_kolesaDiski) {
//	this.id_kolesaDiski = id_kolesaDiski;
//    }

    public String getTypeDetali() {
	return typeDetali;
    }

    public void setTypeDetali(String typeDetali) {
	this.typeDetali = typeDetali;
    }

    public String getTypeDiska() {
	return typeDiska;
    }

    public void setTypeDiska(String typeDiska) {
	this.typeDiska = typeDiska;
    }

    public String getPCD() {
	return PCD;
    }

    public void setPCD(String pCD) {
	PCD = pCD;
    }

    public int getKolvoOtversti() {
	return kolvoOtversti;
    }

    public void setKolvoOtversti(int kolvoOtversti) {
	this.kolvoOtversti = kolvoOtversti;
    }

    public int getDiametrStupOtverstia() {
	return diametrStupOtverstia;
    }

    public void setDiametrStupOtverstia(int diametrStupOtverstia) {
	this.diametrStupOtverstia = diametrStupOtverstia;
    }

    public int getDiametr() {
	return diametr;
    }

    public void setDiametr(int diametr) {
	this.diametr = diametr;
    }

    public String getFirmaModel() {
	return firmaModel;
    }

    public void setFirmaModel(String firmaModel) {
	this.firmaModel = firmaModel;
    }

    public String getSezon() {
	return sezon;
    }

    public void setSezon(String sezon) {
	this.sezon = sezon;
    }

    public int getShirina() {
	return shirina;
    }

    public void setShirina(int shirina) {
	this.shirina = shirina;
    }

    public int getVisota() {
	return visota;
    }

    public void setVisota(int visota) {
	this.visota = visota;
    }

    public int getIndexNagruzki() {
	return indexNagruzki;
    }

    public void setIndexNagruzki(int indexNagruzki) {
	this.indexNagruzki = indexNagruzki;
    }

    public String getIndexSkorosti() {
	return indexSkorosti;
    }

    public void setIndexSkorosti(String indexSkorosti) {
	this.indexSkorosti = indexSkorosti;
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
	return "KolesaDiski [id_kolesaDiski=" + id_kolesaDiski + ", typeDetali=" + typeDetali + ", typeDiska="
		+ typeDiska + ", PCD=" + PCD + ", kolvoOtversti=" + kolvoOtversti + ", diametrStupOtverstia="
		+ diametrStupOtverstia + ", diametr=" + diametr + ", firmaModel=" + firmaModel + ", sezon=" + sezon
		+ ", shirina=" + shirina + ", visota=" + visota + ", indexNagruzki=" + indexNagruzki
		+ ", indexSkorosti=" + indexSkorosti + ", garantiya=" + garantiya + ", dopComment=" + dopComment + "]";
    }

}
