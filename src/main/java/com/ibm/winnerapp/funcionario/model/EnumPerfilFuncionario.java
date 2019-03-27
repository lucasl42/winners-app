package com.ibm.winnerapp.funcionario.model;

public enum EnumPerfilFuncionario {
	Funcionario(1),Lider(2),Administrador(3);
	
	public int tipo;
	
	private EnumPerfilFuncionario(int tipo) {
		this.tipo = tipo;
	}
	
	public int getTipo() {
		return tipo;
	}

}
