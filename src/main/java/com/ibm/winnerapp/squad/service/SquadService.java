package com.ibm.winnerapp.squad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.winnerapp.squad.model.Squad;
import com.ibm.winnerapp.squad.repository.SquadRepository;

@Service
public class SquadService {
	
	@Autowired
	private SquadRepository squadRepository;
	
	
	public List<Squad> getAllSquads(){
		return squadRepository.findAll();
	}
	
	public Squad getOne(long id) {
		return squadRepository.getOne(id);
	}
	
	public void saveSquad(Squad squad){
		squadRepository.save(squad);
	
	}
	
	public void deletarSquad(Squad squad) {
		squadRepository.delete(squad);
	}
}

