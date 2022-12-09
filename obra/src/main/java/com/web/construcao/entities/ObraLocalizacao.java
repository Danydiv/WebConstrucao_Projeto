package com.web.construcao.entities;

import java.util.Objects;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class ObraLocalizacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cidade;
	
	@OneToOne
	@JoinColumn(name = "obra_Local")
	private Obra obraId;
	private String estado;
	private double latitude;
	private double longitude;
	
	public ObraLocalizacao() {}

	public ObraLocalizacao(Long id, String cidade, Obra obraId, String estado, double latitude, double longitude) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.obraId = obraId;
		this.estado = estado;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getId() {
		return id;
	}

	public static void setId(Long id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public static void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Obra getObraId() {
		return obraId;
	}

	public static void setObraId(Obra obraId) {
		this.obraId = obraId;
	}

	public String getEstado() {
		return estado;
	}

	public static void setEstado(String estado) {
		this.estado = estado;
	}

	public double getLatitude() {
		return latitude;
	}

	public static void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public static void setLongitude(double longitude) {
		this.longitude = longitude;
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
		ObraLocalizacao other = (ObraLocalizacao) obj;
		return Objects.equals(id, other.id);
	}
	
	
	    
}
