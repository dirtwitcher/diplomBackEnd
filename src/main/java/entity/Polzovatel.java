package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "polzovatel")
public class Polzovatel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_polzovatel;

    @Column(name = "FIO", length = 250)
    private String FIO;

    @Column(name = "dataRegistr")
    private Date dataRegistr;

    public Polzovatel() {
    }

    public int getId_polzovatel() {
	return id_polzovatel;
    }

//    public void setId_polzovatel(int id_polzovatel) {
//	this.id_polzovatel = id_polzovatel;
//    }

    public String getFIO() {
	return FIO;
    }

    public void setFIO(String fIO) {
	FIO = fIO;
    }

    public Date getDataRegistr() {
	return dataRegistr;
    }

    public void setDataRegistr(Date dataRegistr) {
	this.dataRegistr = dataRegistr;
    }

    @Override
    public String toString() {
	return "Polzovatel [id_polzovatel=" + id_polzovatel + ", FIO=" + FIO + ", dataRegistr=" + dataRegistr + "]";
    }

}
