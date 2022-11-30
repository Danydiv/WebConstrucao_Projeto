package com.web.construcao.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Obra{

	private Long id;
	private String nome;
    private Integer anoConstrucao;
    private String coordenacao;
    private String gerencia;
    private String diretoria;
    private String outorga;
    private String titularidade;
    
    private List<ObraInspecao> obraInspecao = new ArrayList<>();
    private ObraLocalizacao obraLocalizacao;
    private ObraDetalhesTecnicos obraDetalhesTecnicos;
    
    
    public Obra() {
    	
    }

	public Obra(Long id, String nome, Integer anoConstrucao, String coordenacao, String gerencia, String diretoria,
			String outorga, String titularidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.anoConstrucao = anoConstrucao;
		this.coordenacao = coordenacao;
		this.gerencia = gerencia;
		this.diretoria = diretoria;
		this.outorga = outorga;
		this.titularidade = titularidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAnoConstrucao() {
		return anoConstrucao;
	}

	public void setAnoConstrucao(Integer anoConstrucao) {
		this.anoConstrucao = anoConstrucao;
	}

	public String getCoordenacao() {
		return coordenacao;
	}

	public void setCoordenacao(String coordenacao) {
		this.coordenacao = coordenacao;
	}

	public String getGerencia() {
		return gerencia;
	}

	public void setGerencia(String gerencia) {
		this.gerencia = gerencia;
	}

	public String getDiretoria() {
		return diretoria;
	}

	public void setDiretoria(String diretoria) {
		this.diretoria = diretoria;
	}

	public String getOutorga() {
		return outorga;
	}

	public void setOutorga(String outorga) {
		this.outorga = outorga;
	}

	public String getTitularidade() {
		return titularidade;
	}

	public void setTitularidade(String titularidade) {
		this.titularidade = titularidade;
	}
	
	public List<ObraInspecao> getObraInspecao() {
		return obraInspecao;
	}
	
	public ObraLocalizacao getObraLocalizacao() {
		return obraLocalizacao;
	}


	public ObraDetalhesTecnicos getObraDetalhesTecnicos() {
		return obraDetalhesTecnicos;
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
		Obra other = (Obra) obj;
		return Objects.equals(id, other.id);
	}

	

	
	
    
	
}

