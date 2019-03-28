package com.ibm.winnerapp.ss.service;

import java.util.List;

import com.ibm.winnerapp.ss.model.Ss;

public interface SsService {

	public List<Ss> getAllSs();
	
	public Ss getOne(long id);
	
	public void saveSs(Ss ss);
	
	public void deletarSs(Ss ss);
}
