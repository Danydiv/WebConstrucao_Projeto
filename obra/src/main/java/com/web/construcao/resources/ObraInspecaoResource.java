package com.web.construcao.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.construcao.entities.ObraInspecao;

public class ObraInspecaoResource {
	
	@RestController
	@RequestMapping(value = "/obraInsp")
	public class ObraResource {
		
		@GetMapping
		public ResponseEntity<List<ObraInspecao>> findAll(){		
			
			ObraInspecao y = new ObraInspecao(null, null, null, null, null, null);
			
			List<ObraInspecao> list = new ArrayList<>();
			list.addAll(Arrays.asList(y));
			return ResponseEntity.ok().body(list);
		}
    }
}
