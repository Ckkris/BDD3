package org.demo.core.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Created by christophe on 4/20/2015.
 */

@Entity
@Table(name = "client")
public class Client implements Serializable{
	
	private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)  // Optionnel
    @Column(name = "login")
    private String Login;

    /* l'attribut "name" pour l'annotation
    @Table existe pour le package javax.persistence, pas pour l'annotation du package d'hibernate.
    Donc dans un premier temps, pense à cliquer sur la popup en haut à droite de ton screenshot
    "Enable Auto Import" pour maven (ça te ramènera les dépendences maven automatiquement sans avoir à refaire un
    click droit sur ton projet > Maven > Reimport)
    Dans un deuxième temps, enlève ton import sur org.hibernate.annotations.Table et import plutôt
    "javax.persistence.Table", l'attribut name sera détecté (si tu fais F3 avec la keymap eclipse sur cette annotation,
    tu trouveras l'attribut "name" dans l'implementation, si tu n'arrives pas à récupérer les sources, voilà la preuve via
    la source de cette annotation*/

    @Column(name = "nom")
    private String Nom;
    @Column(name = "prenom")
    private String Prenom;
    @Column(name = "adresse")
    private String Adresse;
    @Column(name = "mail")
    private String Mail;
    @Column(name = "passeword")
    private String Passeword;

     /*   @OneToMany(fetch = FetchType.LAZY) //(mappedBy="client")
        @JoinColumn(name="id_compte")
        private Set<Compte> comptes;*/

        //constructeur par défaut
        public Client() {
        }

        // constructeur avec paramètres
        public Client(String nom, String prenom, String login, String adresse, String mail, String passeword) {
            this.Nom=nom;
            this.Prenom=prenom;
            this.Adresse=adresse;
            this.Mail=mail;
            this.Login=login;
            this.Passeword=passeword;
        }

        
        //toString pour que springboot lise le contenue des lignes de la BDD en lancant DataBdd2Application
    
        @Override
    public String toString() {
        return String.format("Client[login='%s', nom='%s', prenom='%s', mail='%s', adresse='%s', Passeword='%s']", Login, Nom, Prenom, Mail, Adresse, Passeword); //Indispensable pour utiliser la méthode findAll()
    }

        //getters et setters pour lire le contenue des objet en lancant le controller2
        
        public String getNom()
        {
        	return this.Nom;
        }
        
        public String getPrenom()
        {
        	return this.Prenom;
        }
        
        public String getAdresse()
        {
        	return this.Adresse;
        }
        
        public String mail()
        {
        	return this.Mail;
        }
        
        public String getLogin(){
        	return this.Login;
        }
        
        public String getPasseword(){
        	return this.Passeword;
        }
        
        
        
        
        
        
}
