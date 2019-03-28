package com.ibm.winnerapp.squad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.winnerapp.squad.model.Squad;
import com.ibm.winnerapp.squad.repository.SquadRepository;
import com.ibm.winnerapp.squad.service.SquadService;

@Service
public class SquadServiceImpl implements SquadService{
	
	@Autowired
	private SquadRepository squadRepository;
	
	@Override
	public List<Squad> getAllSquads(){
		return squadRepository.findAll();
	}
	
	@Override
	public Squad getOne(long id) {
		return squadRepository.getOne(id);
	}
	
	@Override
	public void saveSquad(Squad squad){
		squadRepository.save(squad);
	
	}
	
	@Override
	public void deletarSquad(Squad squad) {
		squadRepository.delete(squad);
	}
}

