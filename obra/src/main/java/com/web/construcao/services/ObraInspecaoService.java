package com.web.construcao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.web.construcao.entities.Obra;
import com.web.construcao.entities.ObraInspecao;
import com.web.construcao.repositories.ObraRepository;

@Service
public class ObraInspecaoService {
	
	@Autowired
	private ObraRepository obraRepository;
	
	public List<Obra> findAll(){
		
		return (List<Obra>) obraRepository.findAll();
	}

    public static Optional<ObraInspecao> findById(Integer id) {
        return null;
    }

    public static Object save(ObraInspecao obraInspecao) {
        return null;
    }

    public static void existsById(Long id) {
    }
	

}
