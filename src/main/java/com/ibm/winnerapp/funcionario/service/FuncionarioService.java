package com.ibm.winnerapp.funcionario.service;

import java.util.List;

import com.ibm.winnerapp.funcionario.model.Funcionario;

public interface FuncionarioService {

	public List<Funcionario> getAllFuncionarios();
	
	public Funcionario getOne(long funcional);
	
	public void saveFuncionarios(Funcionario funcionario);
	
	public void deletarFuncionario(Funcionario funcionario);
}
