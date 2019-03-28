package com.ibm.winnerapp.ss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.winnerapp.ss.model.Ss;

@Repository
public interface SsRepository extends JpaRepository<Ss, Long> {
 
}
 