package org.demo.core.repositories;

import java.util.List;

import org.demo.core.entities.Courant;
import org.springframework.data.repository.CrudRepository;

public interface CourantRepository extends CrudRepository<Courant, Long> {
	
//	 // liste des créneaux horaires d'un médecin
//	@Query("select c from courant c where c.login_fk=?1")
//	Iterable<Courant> getCourantClient(String login_fk);
	
	List<Courant> findByLoginfk(String loginfk);

}
