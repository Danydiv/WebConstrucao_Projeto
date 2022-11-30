package com.web.construcao.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.construcao.entities.ObraDetalhesTecnicos;

@RestController
@RequestMapping(value = "/detalhes")
public class ObraDetalhesTecnicosResource {
	
	@GetMapping
	public ResponseEntity<List<ObraDetalhesTecnicos>> findAll(){		
		
		ObraDetalhesTecnicos z = new ObraDetalhesTecnicos(null,null,null,null);
		
		List<ObraDetalhesTecnicos> list = new ArrayList<>();
		list.addAll(Arrays.asList(z));
		return ResponseEntity.ok().body(list);
	}
}
