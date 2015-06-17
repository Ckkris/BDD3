package org.demo.core.repositories;

import java.util.List;

import org.demo.core.entities.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long>{
	

}
