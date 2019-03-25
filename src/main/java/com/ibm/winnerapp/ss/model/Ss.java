package com.ibm.winnerapp.ss.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.LastModifiedDate;

import com.ibm.winnerapp.funcionario.model.Funcionario;
import com.ibm.winnerapp.squad.model.Squad;

@Entity
@Table(name = "ss")
public class Ss implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "ID")
    private Long id;
	private Long totalHoras;
	private Date dataInicial;
	private Date dataFinal;
	private Date horasRestantes;
	@LastModifiedDate
    private Date timeStamp;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lider")
	private Funcionario funcionario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "squad")
	private Squad squad;	
	
	
		
	

}
