package com.ibm.winnerapp.funcionario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.winnerapp.funcionario.model.Funcionario;
import com.ibm.winnerapp.funcionario.repository.FuncionarioRepository;
import com.ibm.winnerapp.funcionario.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Override
	public List<Funcionario> getAllFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
	@Override
	public Funcionario getOne(long funcional) {
		return funcionarioRepository.getOne(funcional);
	}
	
	@Override
	public void saveFuncionarios(Funcionario funcionario){
		funcionarioRepository.save(funcionario);
	}
	
	@Override
	public void deletarFuncionario(Funcionario funcionario) {
		funcionarioRepository.delete(funcionario);
	}
}

