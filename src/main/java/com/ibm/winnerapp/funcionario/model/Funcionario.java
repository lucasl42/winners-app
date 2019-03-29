package com.ibm.winnerapp.funcionario.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ibm.winnerapp.audition.Auditable;
import com.ibm.winnerapp.squad.model.Squad;

@Entity
@Table(name = "funcionario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Funcionario extends Auditable implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "id_funcional")
    private long funcional;
    private String nome;
    private String email;
    private EnumPerfilFuncionario perfil;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_squad")
    @Nullable
	private Squad squad;

    

	public long  getFuncional() {
		return funcional;
	}


	public void setFuncional(long funcional) {
		this.funcional = funcional;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public EnumPerfilFuncionario getPerfil() {
		return perfil;
	}


	public void setPerfil(EnumPerfilFuncionario perfil) {
		this.perfil = perfil;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Squad getSquad() {
		return squad;
	}


	public void setSquad(Squad squad) {
		this.squad = squad;
	}


	@Override
	public String toString() {
		return "Funcionario [funcional=" + funcional + ", nome=" + nome + ", email=" + email + ", perfil=" + perfil
				+ ", squad=" + squad + "]";
	}
    
    

}
