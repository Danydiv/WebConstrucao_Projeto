package com.web.construcao.entities.enums;

public enum ObraRisco {
	
	BAIXO (1),
	MÉDIO(2),
	ALTO(3);
	
private int code;
	
	private ObraRisco(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static ObraRisco valueOf(int code) {
		
		for (ObraRisco value: ObraRisco.values()) {
			if (value.getCode() == code){
				return value;
			}
		}
		throw new IllegalArgumentException("Código inválido!");
	}
}
