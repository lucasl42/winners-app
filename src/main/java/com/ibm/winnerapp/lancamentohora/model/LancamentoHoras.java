package com.ibm.winnerapp.lancamentohora.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.LastModifiedDate;

import com.ibm.winnerapp.funcionario.model.Funcionario;
import com.ibm.winnerapp.ss.model.Ss;

@Entity
@Table(name = "lancamento_horas")
public class LancamentoHoras implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
	private Date data;
	private Long quantidadeDeHoras;
	@LastModifiedDate
    private Date timeStamp;
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lancamento_de_horas_ss_funcionario")
	private Funcionario funcionario;
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lancamento_de_horas_ss")
    private Ss ss;
	

	
	

}
