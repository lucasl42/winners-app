package com.ibm.winnerapp.lancamentohora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.winnerapp.lancamentohora.model.LancamentoHoras;

@Repository
public interface LancamentoHorasRepository extends JpaRepository<LancamentoHoras, Integer> {
 
}
 