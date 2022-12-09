package com.web.construcao.entities;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Inspecao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@OneToOne
	@JoinColumn(name = "obraInsp_insp")
	private ObraInspecao obraInspecaoId;
    private Date data;
    private String observacoes;
    
    public Inspecao() {}

	public Inspecao(Long id, ObraInspecao obraInspecaoId, Date data, String observacoes) {
		super();
		this.id = id;
		this.obraInspecaoId = obraInspecaoId;
		this.data = data;
		this.observacoes = observacoes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ObraInspecao getObraInspecaoId() {
		return obraInspecaoId;
	}

	public void setObraInspecao(ObraInspecao obraInspecaoId) {
		this.obraInspecaoId = obraInspecaoId;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
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
		Inspecao other = (Inspecao) obj;
		return Objects.equals(id, other.id);
	}

    public void setDate(Object date) {
    }

    public void setObraInspecaoId(Object obraInspecaoId2) {
    }
    
    
    

}
