package com.ibm.winnerapp.ss.controller;

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

import com.ibm.winnerapp.ss.model.Ss;
import com.ibm.winnerapp.ss.service.SsService;

@RestController
@RequestMapping( value = "/ss", produces = "application/json")
public class SsController {
	@Autowired
	private SsService ssservice;
	
	@CrossOrigin
	@GetMapping(value = "/listar")
	public List<Ss> getSs() {
		return ssservice.getAllSs();
	}

	@CrossOrigin
	@PutMapping(value = "/cadastrar")
	public void saveSs(@RequestBody Ss ss) {
		ssservice.saveSs(ss);
	}

	@CrossOrigin
	@PutMapping(value = "/alterar")
	public void updateSs(@RequestBody Ss ss) {
		ssservice.saveSs(ss);
	}
	
	@CrossOrigin
	@GetMapping(value = "/deletar/{id}")
	public void deletarSs(@PathVariable(name = "id") long id) {
		Ss generico = new Ss();
		generico.setId(id);
		ssservice.deletarSs(generico);
	}

	@CrossOrigin
	@GetMapping(value = "{id}") 
	public Ss getSs(@PathVariable(name = "id") long id) {
		return ssservice.getOne(id);
	}
}
