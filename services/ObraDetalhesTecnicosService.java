package com.web.construcao.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.construcao.entities.Obra;
import com.web.construcao.repositories.ObraRepository;

@Service
public class ObraDetalhesTecnicosService {
	
	@Autowired
	private ObraRepository obraRepository;
	
	public List<Obra> findAll(){
		
		return (List<Obra>) obraRepository.findAll();
	}
	

}
