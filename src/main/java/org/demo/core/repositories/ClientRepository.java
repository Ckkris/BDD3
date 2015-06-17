package org.demo.core.repositories;
import org.demo.core.entities.Client;
import org.demo.core.entities.Compte;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, String> {
	
//	@Query("select c from Creneau c where c.medecin.id=?1")
//	Iterable<Creneau> getAllCreneaux(long idMedecin);
	
}
