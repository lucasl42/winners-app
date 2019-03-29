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

import com.ibm.winnerapp.audition.Auditable;
import com.ibm.winnerapp.funcionario.model.Funcionario;
import com.ibm.winnerapp.squad.model.Squad;

@Entity
@Table(name = "ss")
public class Ss extends Auditable implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "ID")
    private Long id;
	private Integer totalHoras;
	private Date dataInicial;
	private Date dataFinal;
	private Integer horasRestantes;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lider")
	private Funcionario funcionario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "squad")
	private Squad squad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTotalHoras() {
		return totalHoras;
	}

	public void setTotalHoras(Integer totalHoras) {
		this.totalHoras = totalHoras;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Integer getHorasRestantes() {
		return horasRestantes;
	}

	public void setHorasRestantes(Integer horasRestantes) {
		this.horasRestantes = horasRestantes;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Squad getSquad() {
		return squad;
	}

	public void setSquad(Squad squad) {
		this.squad = squad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
		
	

}
