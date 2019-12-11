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

    @Column(name = "login", length = 250)
    private String login;

    @Column(name = "password", length = 250)
    private String password;

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

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public Date getDataRegistr() {
	return dataRegistr;
    }

    public void setDataRegistr(Date dataRegistr) {
	this.dataRegistr = dataRegistr;
    }

    @Override
    public String toString() {
	return "Polzovatel [id_polzovatel=" + id_polzovatel + ", FIO=" + login + ", dataRegistr=" + dataRegistr + "]";
    }

}
