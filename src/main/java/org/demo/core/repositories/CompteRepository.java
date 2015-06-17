package org.demo.core.repositories;

import org.demo.core.entities.Compte;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CompteRepository extends CrudRepository<Compte, Long> {
	
}
