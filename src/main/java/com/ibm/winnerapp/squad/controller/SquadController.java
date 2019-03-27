package com.ibm.winnerapp.squad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.winnerapp.squad.model.Squad;
import com.ibm.winnerapp.squad.service.SquadService;

@RestController
@RequestMapping(value = "/squad", produces = "application/json")
public class SquadController {

	@Autowired
	private SquadService squadservice;

	@CrossOrigin
	@GetMapping(value = "/listar")
	public List<Squad> getSquad() {
		return squadservice.getAllSquads();
	}

	@CrossOrigin
	@PutMapping(value = "/cadastrar")
	public void saveSquad(@RequestBody Squad squad) {
		squadservice.saveSquad(squad);
	}

	@CrossOrigin
	@PutMapping(value = "/alterar")
	public void updateSquad(@RequestBody Squad squad) {
		squadservice.saveSquad(squad);
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, value = "/deletar/{id}")
	public void deletarSquad(@PathVariable(name = "id") long id) {
		Squad generico = new Squad();
		generico.setId(id);
		squadservice.deletarSquad(generico);
	}

	@CrossOrigin
	@GetMapping(value = "{id}") 
	public Squad getSquad(@PathVariable(name = "id") long id) {
		return squadservice.getOne(id);
	}

}
