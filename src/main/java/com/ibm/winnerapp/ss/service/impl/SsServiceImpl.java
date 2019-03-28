package com.ibm.winnerapp.ss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.winnerapp.ss.model.Ss;
import com.ibm.winnerapp.ss.repository.SsRepository;
import com.ibm.winnerapp.ss.service.SsService;

@Service
public class SsServiceImpl implements SsService{
	
	@Autowired
	private SsRepository ssRepository;
	
	
	@Override
	public List<Ss> getAllSs(){
		return ssRepository.findAll();
	}
	
	@Override
	public Ss getOne(long id) {
		return ssRepository.getOne(id);
	}
	
	@Override
	public void saveSs(Ss ss){
		ssRepository.save(ss);
	}
	
	@Override
	public void deletarSs(Ss ss) {
		ssRepository.delete(ss);
	}
}
