package com.ibm.winnerapp.lancamentohora.controller;

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

import com.ibm.winnerapp.lancamentohora.model.LancamentoHoras;
import com.ibm.winnerapp.lancamentohora.service.LancamentoHorasService;

@RestController
@RequestMapping(value = "/lancamentohoras", produces = "application/json")
public class LancamentoHorasController {

	@Autowired
	LancamentoHorasService lancamentoHorasService;

	@CrossOrigin
	@GetMapping(value = "/listar")
	public List<LancamentoHoras> getLancamentoHoras() {
		return lancamentoHorasService.getAllLancamentoHoras();
	}

	@CrossOrigin
	@PostMapping(value = "/cadastrar")
	public void saveLancamentoHoras(@RequestBody LancamentoHoras lancamentoHoras) {
		lancamentoHorasService.saveLancamentoHoras(lancamentoHoras);
	}

	@CrossOrigin
	@PutMapping(value = "/alterar")
	public void updateLancamentoHoras(@RequestBody LancamentoHoras lancamentoHoras) {
		lancamentoHorasService.saveLancamentoHoras(lancamentoHoras);
	}
	
	@CrossOrigin
	@DeleteMapping( value = "/deletar/{id}")
	public void deletarLancamentoHoras(@PathVariable(name = "id") int id) {
		LancamentoHoras lancamentoHoras = new LancamentoHoras();
		lancamentoHoras.setId(id);
		lancamentoHorasService.deletarLancamentoHoras(lancamentoHoras);
	}
}
