package com.web.construcao.entities.enums;

public enum ObraTipo {

	HIDRAULICA(1), 
	ESTRUTURA(2),
	GEOTECNICA(3);
	
	private int code;
	
	private ObraTipo(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static ObraTipo valueOf(int code) { // PERCORRER TODOS OS VALORE POSSÍVEIS EM UMA BUSCA
		
		for (ObraTipo value: ObraTipo.values()) {
			if (value.getCode() == code){
				return value;
			}
		}
		throw new IllegalArgumentException("Código inválido!");
	}
}
