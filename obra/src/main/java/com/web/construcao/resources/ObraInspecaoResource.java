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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.construcao.entities.ObraInspecao;
import com.web.construcao.services.ObraInspecaoService;

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

	@PostMapping
    public ResponseEntity<Object> saveProjObra(@RequestBody ObraInspecaoDot obraInspecaoDot) {

        ObraInspecaoService.existsById(obraInspecaoDot.getId())
		{
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Id já existe!");
        }
	}

	@DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProjObra(@PathVariable(value = "id") Integer id) {
       
        ObraInspecaoService.delete(ObraInspecaoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body(" Obrainspecao deletada.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProjObra(@PathVariable(value = "id") Integer id,
            @RequestBody ObraInspecaoDot obraInspecaoDot) {
        Optional<ObraInspecao> obraInspecaoOptional = ObraInspecaoService.findById(id);
        ObraInspecaoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Obrainspecao Spot not found.");
        }
        var ObraInspecao = obraInspecaoOptional.get();
        ObraInspecao.setId(obraInspecaoDot.getId());
        ObraInspecao.setFrequencia(obraInspecaoDot.getFrequencia());
        ObraInspecao.setMes(obraInspecaoDot.getMes());
        ObraInspecao.setStatus(obraInspecaoDot.getStatus());
        ObraInspecao.setPrioridade(obraInspecaoDot.getPrioridade());
        ObraInspecao.setObraId(obraInspecaoDot.getObraId());

        return ResponseEntity.status(HttpStatus.OK).body(ObraInspecaoService.save(ObraInspecao));
    }
}
