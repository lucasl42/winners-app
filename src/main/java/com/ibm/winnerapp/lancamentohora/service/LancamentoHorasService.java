package com.ibm.winnerapp.lancamentohora.service;

import java.util.List;

import com.ibm.winnerapp.lancamentohora.model.LancamentoHoras;

public interface LancamentoHorasService {

	public List<LancamentoHoras> getAllLancamentoHoras();
	
	public LancamentoHoras getOne(int id);
	
	public void saveLancamentoHoras(LancamentoHoras lancamentoHoras);
	
	public void deletarLancamentoHoras(LancamentoHoras lancamentoHoras);
}
