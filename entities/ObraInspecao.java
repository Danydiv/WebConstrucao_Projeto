package com.web.construcao.entities;

import java.util.Objects;


import com.web.construcao.entities.enums.InspecaoFrequencia;
import com.web.construcao.entities.enums.InspecaoStatus;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class ObraInspecao { 


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@OneToOne
	@JoinColumn(name = "obra_inspecao" )
    private Obra obraId;
    private Integer inspecaoFrequencia;
    private Integer mes;
    private Integer inspecaoStatus;
    private Integer prioridade;
    
    @OneToOne(mappedBy = "obraInspecaoId")
    private Inspecao inspecao;
    
    public ObraInspecao() {}

	public ObraInspecao(Long id, Obra obraId, InspecaoFrequencia inspecaoFrequencia, Integer mes, InspecaoStatus inspecaoStatus, Integer prioridade) {
		super();
		this.id = id;
		this.obraId = obraId;
		setInspecaoFrequencia(inspecaoFrequencia);
		this.mes = mes;
		setInspecaoStatus(inspecaoStatus);
		this.prioridade = prioridade;
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

	public InspecaoFrequencia getInspecaoFrequencia() {
		return InspecaoFrequencia.valueOf(inspecaoFrequencia);
	}

	public void setInspecaoFrequencia(InspecaoFrequencia inspecaoFrequencia) {
		this.inspecaoFrequencia = inspecaoFrequencia.getCode();
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public InspecaoStatus getIsnpecaoStatus() {
		return InspecaoStatus.valueOf(inspecaoStatus);
	}

	public void setInspecaoStatus(InspecaoStatus inspecaoStatus) {
		this.inspecaoStatus = inspecaoStatus.getCode();
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}
	
	public Inspecao getInspecao() {
		return inspecao;
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
		ObraInspecao other = (ObraInspecao) obj;
		return Objects.equals(id, other.id);
	}

	

	
    
    
}
