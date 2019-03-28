package com.ibm.winnerapp.squad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.winnerapp.squad.model.Squad;

@Repository
public interface SquadRepository extends JpaRepository<Squad, Long> {

 
}
 