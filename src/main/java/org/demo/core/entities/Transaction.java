package org.demo.core.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Transaction {
	
	  @ManyToOne//(fetch = FetchType.LAZY) --> On enlève car impossibilité d'utilisé getcompte() à partir d'un objet transaction
	  @JoinColumn(name = "id_compte_fk")//meme nom que dans la table transaction et non celui de la table compte !!
	  private Compte compte;
	  
	  //Clé étrangère
	   @Column (name = "id_compte_fk", insertable=false ,updatable=false) 
	   private String idcomptefkemeteur;
	 //Clé étrangère
	   @Column (name = "id_compte_fk", insertable=false ,updatable=false) 
	   private String idcomptefkrecepteur; 


	  public Transaction(String idcomptefkemeteur, String idcommptefkrecepteur,
			Long id_trans, Long montant_trans, Long date_trans) {
		super();
		this.idcomptefkemeteur = idcomptefkemeteur;
		this.idcomptefkrecepteur = idcomptefkrecepteur;
		this.id_trans = id_trans;
		this.montant_trans = montant_trans;
		this.date_trans = date_trans;
	}
	
	    //clé primaire
	    //@Column(name = "id_compte", unique=true, insertable = true, updatable= true)
	    @Id
	    @Column(name = "id_trans")
	    private Long id_trans;
	    @Column(name ="montant_trans")
	    private Long montant_trans;
	    @Column(name ="date_trans")
	    private Long date_trans;
	    
	    
	    //Geters / Seters
		public Compte getCompte() {
			return compte;
		}
		public void setCompte(Compte compte) {
			this.compte = compte;
		}
		public String getIdcomptefk_Emeteur() {
			return idcomptefkemeteur;
		}
		public void setIdcomptefk_Emeteur(String idcomptefkemeteur) {
			this.idcomptefkemeteur = idcomptefkemeteur;
		}
		public String getIdcomptefk_Recepteur() {
			return idcomptefkrecepteur;
		}
		public void setIdcomptefk_Recepteur(String idcomptefkrecepteur) {
			this.idcomptefkrecepteur = idcomptefkrecepteur;
		}
		public Long getId_trans() {
			return id_trans;
		}
		public void setId_trans(Long id_trans) {
			this.id_trans = id_trans;
		}
		public Long getMontant_trans() {
			return montant_trans;
		}
		public void setMontant_trans(Long montant_trans) {
			this.montant_trans = montant_trans;
		}
		public Long getDate_trans() {
			return date_trans;
		}
		public void setDate_trans(Long date_trans) {
			this.date_trans = date_trans;
		}

}
