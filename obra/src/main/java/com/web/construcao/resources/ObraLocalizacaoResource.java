package com.web.construcao.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.construcao.entities.ObraLocalizacao;
import com.web.construcao.services.ObraLocalizacaoService;

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

	@DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProjObra(@PathVariable(value = "id") Integer id) {
        
		
        ObraLocalizacaoService.delete(ObraLocalizacaoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body(" ObraLocalizacaora deletada");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProjObra(@PathVariable(value = "id") Integer id,
            @RequestBody ObraLocalizacaoDot obraLocalizacaoDot) {
        Optional<ObraLocalizacao> ObraLocalizacaoOptional = ObraLocalizacaoService.findById(id);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ObraLocalizacaora Spot not found.");
        
        ObraLocalizacao.setId(obraLocalizacaoDot.getId());
        ObraLocalizacao.setCidade(obraLocalizacaoDot.getCidade());
        ObraLocalizacao.setEstado(obraLocalizacaoDot.getEstado());
        ObraLocalizacao.setLatitude(obraLocalizacaoDot.getLatitude());
        ObraLocalizacao.setLongitude(obraLocalizacaoDot.getLatitude());
        ObraLocalizacao.setObraId(obraLocalizacaoDot.getObraId());

        return ResponseEntity.status(HttpStatus.OK).body(obraLocalizacaoServices.save(obraLocalizacao));
    }

}

