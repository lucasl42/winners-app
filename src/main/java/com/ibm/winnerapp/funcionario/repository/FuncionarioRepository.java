package com.ibm.winnerapp.funcionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.winnerapp.funcionario.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
 
}
 