package com.web.construcao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.web.construcao.entities.Obra;

@Repository
public interface ObraRepository extends CrudRepository<Obra, Long>{
	
	
}
