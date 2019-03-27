package com.ibm.winnerapp.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.winnerapp.ss.model.Ss;
import com.ibm.winnerapp.ss.repository.SsRepository;

@Service
public class SsService {
	
	@Autowired
	private SsRepository ssRepository;
	
	
	public List<Ss> getAllSs(){
		return ssRepository.findAll();
	}
	
	public Ss getOne(long id) {
		return ssRepository.getOne(id);
	}
	
	public void saveSs(Ss ss){
		ssRepository.save(ss);
	}
	
	public void deletarSs(Ss ss) {
		ssRepository.delete(ss);
	}
}
