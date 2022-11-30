package com.web.construcao.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.construcao.entities.Obra;


@RestController
@RequestMapping(value = "/obras")
public class ObraResource {
	
	@GetMapping
	public ResponseEntity<List<Obra>> findAll(){		
		
		Obra BoaVista = new Obra(1L, "Boa Vista", 2022, "Danyelle",  "Danyelle",  "Danyelle",  "Danyelle",  "Danyelle");
		
		List<Obra> list = new ArrayList<>();
		list.addAll(Arrays.asList(BoaVista));
		return ResponseEntity.ok().body(list);
	}

}
