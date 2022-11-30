package com.web.construcao.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.construcao.entities.Inspecao;


@RestController
@RequestMapping(value = "/Inspecao")
public class InspecaoResource {
	
	@GetMapping
	public ResponseEntity<List<Inspecao>> findAll(){		
		
		Inspecao a = new Inspecao(null, null, null, null);
		
		List<Inspecao> list = new ArrayList<>();
		list.addAll(Arrays.asList(a));
		return ResponseEntity.ok().body(list);
	}

}
