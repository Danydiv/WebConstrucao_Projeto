package com.web.construcao.entities.enums;

public enum InspecaoStatus {

	EM_DIA (1),
	PENDENTE(2);
	
private int code;
	
	private InspecaoStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static InspecaoStatus valueOf(int code) {
		
		for (InspecaoStatus value: InspecaoStatus.values()) {
			if (value.getCode() == code){
				return value;
			}
		}
		throw new IllegalArgumentException("Código inválido!");
	}
}
