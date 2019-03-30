package com.ibm.winnerapp.funcionario.model;

public enum EnumPerfilFuncionario {
	FUNCIONARIO(1),LIDER(2),ADMINISTRADOR(3);
	
	public int tipo;
	
	private EnumPerfilFuncionario(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}

}
