package com.web.construcao.entities.enums;

public enum InspecaoFrequencia {

	ANUAL (1),
	BIENAL(2),
	QUINQUENAL(3);
	
private int code;
	
	private InspecaoFrequencia(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static InspecaoFrequencia valueOf(int code) {
		
		for (InspecaoFrequencia value: InspecaoFrequencia.values()) {
			if (value.getCode() == code){
				return value;
			}
		}
		throw new IllegalArgumentException("Código inválido!");
	}
}
