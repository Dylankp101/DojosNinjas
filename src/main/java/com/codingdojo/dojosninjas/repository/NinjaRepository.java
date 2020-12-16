package com.codingdojo.dojosninjas.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codingdojo.dojosninjas.models.Ninjas;

@Repository
public interface NinjaRepository extends CrudRepository<Ninjas, Long> {
	List<Ninjas> findAll();
}
