package com.ibm.winnerapp.squad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.winnerapp.squad.model.Squad;

public interface SquadRepository extends JpaRepository<Squad, Integer> {
 
}
 