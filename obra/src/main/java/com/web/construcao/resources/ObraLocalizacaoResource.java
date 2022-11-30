package com.web.construcao.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.construcao.entities.ObraLocalizacao;

@RestController
@RequestMapping(value = "/local")
public class ObraLocalizacaoResource {
	
	@GetMapping
	public ResponseEntity<List<ObraLocalizacao>> findAll(){		
		
		ObraLocalizacao x = new ObraLocalizacao(1L,"Recife",null,"PE",15.12544,30.12548);
		
		List<ObraLocalizacao> list = new ArrayList<>();
		list.addAll(Arrays.asList(x));
		return ResponseEntity.ok().body(list);
	}

}

