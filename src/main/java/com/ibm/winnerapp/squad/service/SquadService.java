package com.ibm.winnerapp.squad.service;

import java.util.List;

import com.ibm.winnerapp.squad.model.Squad;

public interface SquadService {

	public List<Squad> getAllSquads();
	
	public Squad getOne(long id);
	
	public void saveSquad(Squad squad);
	
	public void deletarSquad(Squad squad);
}
