package com.ibm.winnerapp.funcionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.winnerapp.funcionario.model.Funcionario;
import com.ibm.winnerapp.funcionario.service.FuncionarioService;
import com.ibm.winnerapp.squad.model.Squad;

@RestController
@RequestMapping(value="/funcionario",produces="application/json")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioservice;

	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET , value = "/listar")
	public List<Funcionario> getFuncionarios(){
		return funcionarioservice.getAllFuncionarios(); 
	}
	
	@RequestMapping(method = RequestMethod.GET , value = "/cadastrar")
	public void saveFuncionarios(
			@RequestParam(name="nome",required=true) String nome,
			@RequestParam(name="email",required=true) String email,
			@RequestParam(name="funcional",required=true)Integer funcional,
			@RequestParam(name="perfil",required=true) Integer perfil,
			@RequestParam(name="squad",required=true) Squad squad) {
		Funcionario funcionario = new Funcionario();
		funcionario.setEmail(email);
		funcionario.setFuncional(funcional);
		funcionario.setNome(nome);
		funcionario.setPerfil(perfil);
		funcionario.setSquad(squad);
		
		funcionarioservice.saveFuncionarios(funcionario);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value = "/alterar")
	public void updateFuncionarios(@RequestBody Funcionario funcionario) {
		funcionarioservice.saveFuncionarios(funcionario);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/deletar")
	public void deletarFuncionario(@RequestParam(name="id",required=true) Integer funcional) {
		Funcionario funcionario = new Funcionario();
		funcionario.setFuncional(funcional);
		funcionarioservice.deletarFuncionario(funcionario);
	}
	
	//@CrossOrigin
	@RequestMapping(method = RequestMethod.GET , value = "{funcional}") // /funcionarios/<id>
	public Funcionario getFuncionario(
			@PathVariable(name="funcional")long funcional){
		return funcionarioservice.getOne(funcional); 
	}
	
	
}
