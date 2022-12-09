package com.web.construcao.repositories;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import com.web.construcao.entities.ObraInspecao;

@Repository
public interface InspecaoRepository extends CrudRepository<ObraInspecao, Long>{
	
	
	
}
