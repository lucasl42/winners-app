package com.ibm.winnerapp.funcionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.winnerapp.funcionario.model.EnumPerfilFuncionario;
import com.ibm.winnerapp.funcionario.model.Funcionario;
import com.ibm.winnerapp.funcionario.service.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionario", produces = "application/json")
public class FuncionarioController {

	@Autowired
	private FuncionarioService funcionarioservice;

	@CrossOrigin
	@GetMapping( value = "/listar")
	public List<Funcionario> getFuncionarios() {
		return funcionarioservice.getAllFuncionarios();
	}
	
	@CrossOrigin
	@PostMapping(value = "/cadastrar")
	public void saveFuncionarios(@RequestBody Funcionario funcionario) {
		funcionarioservice.saveFuncionarios(funcionario);
	}
	
	@CrossOrigin
	@PutMapping( value = "/alterar")
	public void updateFuncionarios(
			@RequestBody Funcionario funcionario) {
		funcionarioservice.saveFuncionarios(funcionario);
	}
	
	@CrossOrigin
	@DeleteMapping( value = "/deletar/{funcional}")
	public void deletarFuncionario(@PathVariable(name = "funcional") long funcional) {
		Funcionario funcionario = new Funcionario();
		funcionario.setFuncional(funcional);
		funcionarioservice.deletarFuncionario(funcionario);
	}

	@CrossOrigin
	@GetMapping( value = "{funcional}") 
	public Funcionario getFuncionario(@PathVariable(name = "funcional") long funcional) {
		return funcionarioservice.getOne(funcional);
	}
	
	@CrossOrigin
	@GetMapping(value = "perfis")
	public EnumPerfilFuncionario[] getPerfis(){
		return funcionarioservice.getPerfis();
	}

}
