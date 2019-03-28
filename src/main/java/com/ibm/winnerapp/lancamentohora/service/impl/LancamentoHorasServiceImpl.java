package com.ibm.winnerapp.lancamentohora.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.winnerapp.lancamentohora.model.LancamentoHoras;
import com.ibm.winnerapp.lancamentohora.repository.LancamentoHorasRepository;
import com.ibm.winnerapp.lancamentohora.service.LancamentoHorasService;

@Service
public class LancamentoHorasServiceImpl implements LancamentoHorasService{
	
	@Autowired
	LancamentoHorasRepository lancamentoHorasRepository;

	@Override
	public List<LancamentoHoras> getAllLancamentoHoras() {
		return lancamentoHorasRepository.findAll();
	}

	@Override
	public LancamentoHoras getOne(int id) {
		return lancamentoHorasRepository.getOne(id);
	}

	@Override
	public void saveLancamentoHoras(LancamentoHoras lancamentoHoras) {

		lancamentoHorasRepository.save(lancamentoHoras);
	}

	@Override
	public void deletarLancamentoHoras(LancamentoHoras lancamentoHoras) {

		lancamentoHorasRepository.delete(lancamentoHoras);
	}

}
