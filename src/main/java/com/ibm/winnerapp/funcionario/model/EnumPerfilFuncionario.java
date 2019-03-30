package com.ibm.winnerapp.funcionario.model;

public enum EnumPerfilFuncionario {
	FUNCIONARIO("Funcionario"),LIDER("Lider"),ADMINISTRADOR("Administrador");
	
	public String tipo;
	
	private EnumPerfilFuncionario(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}

}
