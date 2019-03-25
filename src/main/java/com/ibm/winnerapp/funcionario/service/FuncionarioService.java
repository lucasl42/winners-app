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
		Funcionario func = new Funcionario();
		func.setFuncional(funcionario.getFuncional());
		func.setEmail(funcionario.getEmail());
		func.setPerfil(funcionario.getPerfil());
		func.setNome(funcionario.getNome());
		func.setSquad(funcionario.getSquad());
		funcionarioRepository.save(func);
	}
	
	public void deletarFuncionario(Funcionario funcionario) {
		funcionarioRepository.delete(funcionario);
	}
}

