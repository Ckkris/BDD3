package org.demo.core.metier;

import java.util.List;

import org.demo.core.entities.Client;
import org.demo.core.entities.Compte;
import org.demo.core.entities.Courant;
import org.demo.core.entities.PEL;
import org.demo.core.entities.Transaction;

public interface IMetier {
	
	//CLIENT
	
	//Liste des clients
	public List<Client> getAllClients();
	
	//Liste client à partir de l'ID
	public Client getClientById(String Login);
	
		
	//COURANT
		
	//Liste des courant
    public List<Courant> getAllCourants();
    
	//Liste courant à partir de l'ID client -->Ne marche pas car id_client n'est pas l'id du compte
	public Courant getCourantById(long id);

	// Liste des courants par le login du client
	public List<Courant> findByLoginfk(String loginfk);
	
	
	//PEL 
	
    //Liste des PEL
    public List<PEL> getAllPels();
    
    
    //COMPTE
    
    //liste des compte d'un client
    public List<Compte> getAllComptes();

    
    
    //Transaction
    
    //liste des transactions d'un client
    public List<Transaction> getAllTransactions();
    
    
    
    
    
    
    
//    // liste des compte d'un client
//    public List<Compte> getAllCompte(long login);

}
