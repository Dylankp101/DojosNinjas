package com.codingdojo.dojosninjas.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codingdojo.dojosninjas.models.Dojos;

@Repository
public interface DojoRepository extends CrudRepository<Dojos, Long> {
	List<Dojos> findAll();
}
