package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "auto")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_auto;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_typeAuto")
    private TypeAuto id_typeAuto;

    @OneToOne(mappedBy = "id_auto", cascade = CascadeType.ALL)
    private Dvigatel dvigatelObj;

    @OneToOne(mappedBy = "id_auto", cascade = CascadeType.ALL)
    private Kpp kppObj;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<KuzovnieDetali> kuzovnieDetaliList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<ToplivnayaSistema> toplivnayaSistemaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<DopTovari> dopTovariList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<Podveska> podveskaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<Transmissiya> transmissiyaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<OsnaschKuzova> osnaschKuzovaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<SistemaOhlajdeniya> sistemaOhlajdeniyaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<Elektrika> elektrikaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<RulevoeUpravlenie> rulevoeUpravlenieList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<OtoplenieKondei> otoplenieKondeiList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<OsvetPribory> osvetPriboryList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<Tormoza> tormozaList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id_auto", cascade = CascadeType.ALL)
    private List<KorpusaPatrubki> korpusaPatrubkiList;

    @Column(name = "win", length = 25)
    private String win;

//    @Column(name = "dvigatel", length = 25)
//    private String dvigatel;

    @Column(name = "toplivo", length = 25)
    private String toplivo;

//    @Column(name = "korobka", length = 25)
//    private String korobka;

    @Column(name = "privod", length = 25)
    private String privod;

    @Column(name = "probeg")
    private int probeg;

    @Column(name = "cvet", length = 20)
    private String cvet;

    @Column(name = "dopComment", length = 250)
    private String dopComment;

    @Column(name = "foto")
    // @Lob(type = LobType.BLOB)
    private byte[] image;

    public Auto() {
    }

    public int getId_auto() {
	return id_auto;
    }

    public void setId_auto(int id_auto) {
	this.id_auto = id_auto;
    }

    public TypeAuto getId_typeAuto() {
	return id_typeAuto;
    }

    public void setId_typeAuto(TypeAuto id_typeAuto) {
	this.id_typeAuto = id_typeAuto;
    }

    public Dvigatel getDvigatelObj() {
	return dvigatelObj;
    }

    public void setDvigatelObj(Dvigatel dvigatelObj) {
	this.dvigatelObj = dvigatelObj;
    }

    public Kpp getKppObj() {
	return kppObj;
    }

    public void setKppObj(Kpp kppObj) {
	this.kppObj = kppObj;
    }

    public List<KuzovnieDetali> getKuzovnieDetaliList() {
	return kuzovnieDetaliList;
    }

    public void setKuzovnieDetaliList(List<KuzovnieDetali> kuzovnieDetaliList) {
	this.kuzovnieDetaliList = kuzovnieDetaliList;
    }

    public List<ToplivnayaSistema> getToplivnayaSistemaList() {
	return toplivnayaSistemaList;
    }

    public void setToplivnayaSistemaList(List<ToplivnayaSistema> toplivnayaSistemaList) {
	this.toplivnayaSistemaList = toplivnayaSistemaList;
    }

    public List<DopTovari> getDopTovariList() {
	return dopTovariList;
    }

    public void setDopTovariList(List<DopTovari> dopTovariList) {
	this.dopTovariList = dopTovariList;
    }

    public List<Podveska> getPodveskaList() {
	return podveskaList;
    }

    public void setPodveskaList(List<Podveska> podveskaList) {
	this.podveskaList = podveskaList;
    }

    public List<Transmissiya> getTransmissiyaList() {
	return transmissiyaList;
    }

    public void setTransmissiyaList(List<Transmissiya> transmissiyaList) {
	this.transmissiyaList = transmissiyaList;
    }

    public List<OsnaschKuzova> getOsnaschKuzovaList() {
	return osnaschKuzovaList;
    }

    public void setOsnaschKuzovaList(List<OsnaschKuzova> osnaschKuzovaList) {
	this.osnaschKuzovaList = osnaschKuzovaList;
    }

    public List<SistemaOhlajdeniya> getSistemaOhlajdeniyaList() {
	return sistemaOhlajdeniyaList;
    }

    public void setSistemaOhlajdeniyaList(List<SistemaOhlajdeniya> sistemaOhlajdeniyaList) {
	this.sistemaOhlajdeniyaList = sistemaOhlajdeniyaList;
    }

    public List<Elektrika> getElektrikaList() {
	return elektrikaList;
    }

    public void setElektrikaList(List<Elektrika> elektrikaList) {
	this.elektrikaList = elektrikaList;
    }

    public List<RulevoeUpravlenie> getRulevoeUpravlenieList() {
	return rulevoeUpravlenieList;
    }

    public void setRulevoeUpravlenieList(List<RulevoeUpravlenie> rulevoeUpravlenieList) {
	this.rulevoeUpravlenieList = rulevoeUpravlenieList;
    }

    public List<OtoplenieKondei> getOtoplenieKondeiList() {
	return otoplenieKondeiList;
    }

    public void setOtoplenieKondeiList(List<OtoplenieKondei> otoplenieKondeiList) {
	this.otoplenieKondeiList = otoplenieKondeiList;
    }

    public List<OsvetPribory> getOsvetPriboryList() {
	return osvetPriboryList;
    }

    public void setOsvetPriboryList(List<OsvetPribory> osvetPriboryList) {
	this.osvetPriboryList = osvetPriboryList;
    }

    public List<Tormoza> getTormozaList() {
	return tormozaList;
    }

    public void setTormozaList(List<Tormoza> tormozaList) {
	this.tormozaList = tormozaList;
    }

    public List<KorpusaPatrubki> getKorpusaPatrubkiList() {
	return korpusaPatrubkiList;
    }

    public void setKorpusaPatrubkiList(List<KorpusaPatrubki> korpusaPatrubkiList) {
	this.korpusaPatrubkiList = korpusaPatrubkiList;
    }

    public String getWin() {
	return win;
    }

    public void setWin(String win) {
	this.win = win;
    }

    public String getToplivo() {
	return toplivo;
    }

    public void setToplivo(String toplivo) {
	this.toplivo = toplivo;
    }

    public String getPrivod() {
	return privod;
    }

    public void setPrivod(String privod) {
	this.privod = privod;
    }

    public int getProbeg() {
	return probeg;
    }

    public void setProbeg(int probeg) {
	this.probeg = probeg;
    }

    public String getCvet() {
	return cvet;
    }

    public void setCvet(String cvet) {
	this.cvet = cvet;
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
	return "Auto [id_auto=" + id_auto + ", win=" + win + ", toplivo=" + toplivo + ", privod=" + privod + ", probeg="
		+ probeg + ", cvet=" + cvet + ", dopComment=" + dopComment + "]";
    }

}
