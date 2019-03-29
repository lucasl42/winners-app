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

import com.ibm.winnerapp.audition.Auditable;
import com.ibm.winnerapp.funcionario.model.Funcionario;
import com.ibm.winnerapp.ss.model.Ss;

@Entity
@Table(name = "lancamento_horas")
public class LancamentoHoras extends Auditable implements Serializable{
	
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
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lancamento_de_horas_ss_funcionario")
	private Funcionario funcionario;
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lancamento_de_horas_ss")
    private Ss ss;

    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Long getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}

	public void setQuantidadeDeHoras(Long quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Ss getSs() {
		return ss;
	}

	public void setSs(Ss ss) {
		this.ss = ss;
	}

	@Override
	public String toString() {
		return "LancamentoHoras [id=" + id + ", data=" + data + ", quantidadeDeHoras=" + quantidadeDeHoras
				+ ", funcionario=" + funcionario + ", ss=" + ss + "]";
	}
	
	
	
	

}
