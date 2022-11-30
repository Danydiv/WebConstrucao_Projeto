package com.web.construcao.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.construcao.entities.Obra;

@RestController
@RequestMapping(value = "/obras")
public class ObraResources {
	
	@GetMapping
	public ResponseEntity<Obra> findAll(){
		Obra o = new Obra(1L,"ObraBoaVista", 2020, "Danyelle","Danyelle","Danyelle","Danyelle","Danyelle");
		return ResponseEntity.ok().body(o);
	}

}
