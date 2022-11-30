package com.web.construcao.entities;

import java.util.Objects;

import com.web.construcao.entities.enums.ObraRisco;
import com.web.construcao.entities.enums.ObraTipo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class ObraDetalhesTecnicos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	@OneToOne
	@JoinColumn(name ="Obra_detalhes")
	private Obra obraId;
	private Integer obraTipo;
	private Integer obraRisco;
	
	public ObraDetalhesTecnicos() {}
	
	public ObraDetalhesTecnicos(Long id, Obra obra, ObraTipo obraTipo, ObraRisco obraRisco) {
		super();
		this.id = id;
		this.obraId = obra;
		setObraTipo(obraTipo);
		setObraRisco(obraRisco);
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Obra getObraId() {
		return obraId;
	}

	public void setObraId(Obra obraId) {
		this.obraId = obraId;
	}

	public ObraTipo getObraTipo() {
		return ObraTipo.valueOf(obraTipo);
	}

	public void setObraTipo(ObraTipo obraTipo) {
		this.obraTipo = obraTipo.getCode();
	}

	public ObraRisco getObraRisco() {
		return ObraRisco.valueOf(obraRisco);
	}

	public void setObraRisco(ObraRisco obraRisco) {
		this.obraRisco = obraRisco.getCode();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObraDetalhesTecnicos other = (ObraDetalhesTecnicos) obj;
		return Objects.equals(id, other.id);
	}

	
	
}
