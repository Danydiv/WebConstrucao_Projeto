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

import com.web.construcao.entities.ObraDetalhesTecnicos;
import com.web.construcao.services.ObraDetalhesTecnicosService;

@RestController
@RequestMapping(value = "/detalhes")
public class ObraDetalhesTecnicosResource {
	
	private static final String ObraDetalhesTecnicos = null;
	private static final Object ObraDetalhesTecnicosService = null;

	@GetMapping
	public ResponseEntity<List<ObraDetalhesTecnicos>> findAll(){		
		
		ObraDetalhesTecnicos z = new ObraDetalhesTecnicos(null,null,null,null);
		
		List<ObraDetalhesTecnicos> list = new ArrayList<>();
		list.addAll(Arrays.asList(z));
		return ResponseEntity.ok().body(list);
	}

	@DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProjObra(@PathVariable(value = "id") Integer id) {
	
		((Object) ObraDetalhesTecnicosService).delete(ObraDetalhesTecnicosOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body(" ObraDetalhesTecnicos deletada.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateProjObra(@PathVariable(value = "id") Integer id,@RequestBody ObraDetalhesTecnicosDot obraDetalhesTecnicosDot) {
		{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ObraDetalhesTecnicos Spot not found.");
        }
        ObraDetalhesTecnicos.setId(obraDetalhesTecnicosDot.getId());
        ObraDetalhesTecnicos.setTipo(obraDetalhesTecnicosDot.getTipo());
        ObraDetalhesTecnicos.setRisco(obraDetalhesTecnicosDot.getRisco());
        ObraDetalhesTecnicos.setObraId(obraDetalhesTecnicosDot.getObraId());

        return ResponseEntity.status(HttpStatus.OK).body(ObraDetalhesTecnicosService.save(ObraDetalhesTecnicos));

    }

	@PostMapping
    public ResponseEntity<Object> saveProjObra(@RequestBody ObraDetalhesTecnicosDot obraDetalhesTecnicosDot) {

        ObraDetalhesTecnicosService.existsById(obraDetalhesTecnicosDot.getId())

		{
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: ID is already in use!")
		}

}
