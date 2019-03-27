package com.ibm.winnerapp.funcionario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm.winnerapp.funcionario.model.Funcionario;
import com.ibm.winnerapp.funcionario.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	
	public List<Funcionario> getAllFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
	public Funcionario getOne(long funcional) {
		return funcionarioRepository.getOne(funcional);
	}
	
	public void saveFuncionarios(Funcionario funcionario){
		funcionarioRepository.save(funcionario);
	}
	
	public void deletarFuncionario(Funcionario funcionario) {
		funcionarioRepository.delete(funcionario);
	}
}

