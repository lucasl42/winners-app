package com.ibm.winnerapp.squad.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.LastModifiedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ibm.winnerapp.funcionario.model.Funcionario;
import com.ibm.winnerapp.ss.model.Ss;

@Entity
@Table(name = "squad")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Squad  implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	private String nome;
	@LastModifiedDate
	private Date timeStamp;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "funcionario_lider")
	// VALIDAR SE E LIDER REALMENTE E FAZER ENUM - @Constraint(validatedBy = (Funcionario.getPerfil() == 1))
	private Funcionario lider;

	@OneToMany(mappedBy = "squad", targetEntity = Funcionario.class, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Funcionario> funcionario = new ArrayList<Funcionario>();

	
	@OneToMany(mappedBy = "squad", targetEntity = Ss.class, cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Ss> sss = new ArrayList<Ss>();


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}


	public Funcionario getLider() {
		return lider;
	}


	public void setLider(Funcionario lider) {
		this.lider = lider;
	}


	public List<Funcionario> getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}


	public List<Ss> getSss() {
		return sss;
	}


	public void setSss(List<Ss> sss) {
		this.sss = sss;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

}
