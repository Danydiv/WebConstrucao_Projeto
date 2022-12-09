package com.web.construcao.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
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

	@PostMapping
    public ResponseEntity<Object> saveProjObra(@RequestBody InspecaoDot inspecaoDot) {
        
        Object inspecaoService;
		((Object) inspecaoService).ObservacoesObraInspecaoId(inspecaoDot.getObservacoes())
            return ResponseEntity.status(HttpStatus.CONFLICT).body(" Conflito!");
        }
		
 	@DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProjObra(@PathVariable(value = "id") Integer id) {
        Object inspecaoService;
		Optional<Inspecao> inspecaoOptional = inspecaoService.findById(id);
        ((Object) inspecaoService).delete(inspecaoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body(" Inspecao deletada!.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProjObra(@PathVariable(value = "id") Integer id, @RequestBody InspecaoDot inspecaoDot) {
        Object inspecaoService;
		Optional<Inspecao> inspecaoOptional = ((Object) inspecaoService).findById(id);
        
		inspecaoOptional.isPresent()
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inspecao não encontrada!");
        
        var inspecao = inspecaoOptional.get();
        inspecao.setId(inspecaoDot.getId());
        inspecao.setDate(inspecaoDot.getDate());
        inspecao.setObservacoes(inspecaoDot.getObservacoes());
        inspecao.setObraInspecaoId(inspecaoDot.getObraInspecaoId());

        return ResponseEntity.status(HttpStatus.OK).body(((Object) inspecaoService).save(inspecao));
    }
	
}
