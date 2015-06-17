package org.demo.core.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Compte {
    //private static final Long serialVersionUID = 1L;

    @ManyToOne//(fetch = FetchType.LAZY) --> On enlève car impossibilité d'utilisé getclient() à partir d'un objet compte
    @JoinColumn(name = "login_fk")//meme nom que dans la table compte et non celui de la table client !!
    private Client client;

    //Clé étrangère
    @Column (name = "login_fk", insertable=false ,updatable=false) // ajouté
    private String loginfk; ////meme nom que dans la table compte et non celle de la table client !!

    //clé primaire
    //@Column(name = "id_compte", unique=true, insertable = true, updatable= true)
    @Id
    @Column(name = "id_compte")
    private Long id_compte;
    @Column(name ="plafond")
    private Long plafond;
    @Column(name ="montant")
    private Long montant;
    @Column( name = "datecreation")
    private Date dateCreation;

    //constructeur par defaut
    public Compte(){
    }
    //constructeur par paramètre
    public Compte(Long id, Long plaf, Long mont, Date date, String loginfk){
        this.id_compte=id;
        this.plafond=plaf;
        this.montant=mont;
        this.dateCreation=date;
        this.loginfk=loginfk;
    }
    
    public Client getClient() {
		return client;
	}
    
	public void setClient(Client client) {
		this.client = client;
	}
	
	public String getLogin_fk() {
		return loginfk;
	}
	
	public void setLogin_fk(String loginfk) {
		this.loginfk = loginfk;
	}
	
	public Long getId_compte() {
		return id_compte;
	}
	
	public void setId_compte(Long id_compte) {
		this.id_compte = id_compte;
	}
	
	public Long getPlafond() {
		return plafond;
	}
	
	public void setPlafond(Long plafond) {
		this.plafond = plafond;
	}
	
	public Long getMontant() {
		return montant;
	}
	
	public void setMontant(Long montant) {
		this.montant = montant;
	}
	
	public Date getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	//new SimpleDateFormat("dd/MM/yyyy").format(dateCreation)
    public String toString() {
        return String.format("Compte[%d, %d, %d, %s, %1$td-%1$tm-%1$tY]", id_compte, plafond, montant, loginfk, dateCreation);//Il faut que les paramètre soient présent dans les champs @Column
    }
    
    //getters et setters
  
    
}