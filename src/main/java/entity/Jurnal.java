package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jurnal")
public class Jurnal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_jurnal;

    @Column(name = "FIO", length = 250)
    private String FIO;

    @Column(name = "tablica", length = 150)
    private String tablica;

    @Column(name = "deistvie", length = 150)
    private String deistvie;

    @Column(name = "dataRegistr")
    private Date dataRegistr;

    public Jurnal() {
    }

    public int getId_jurnal() {
	return id_jurnal;
    }

//    public void setId_jurnal(int id_jurnal) {
//	this.id_jurnal = id_jurnal;
//    }

    public String getFIO() {
	return FIO;
    }

    public void setFIO(String fIO) {
	FIO = fIO;
    }

    public String getTablica() {
	return tablica;
    }

    public void setTablica(String tablica) {
	this.tablica = tablica;
    }

    public String getDeistvie() {
	return deistvie;
    }

    public void setDeistvie(String deistvie) {
	this.deistvie = deistvie;
    }

    public Date getDataRegistr() {
	return dataRegistr;
    }

    public void setDataRegistr(Date dataRegistr) {
	this.dataRegistr = dataRegistr;
    }

    @Override
    public String toString() {
	return "Jurnal [id_jurnal=" + id_jurnal + ", FIO=" + FIO + ", tablica=" + tablica + ", deistvie=" + deistvie
		+ ", dataRegistr=" + dataRegistr + "]";
    }

}
