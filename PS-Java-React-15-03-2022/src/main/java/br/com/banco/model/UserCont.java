package br.com.banco.model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
 

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;


@Entity
@Table(name="conta")
public class UserCont{
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) @NotNull
	private Long id_conta;
	
	@Column(name="Nome",nullable =false)
	private String  nome_responsavel; 
	
	@Column (name="Data") 
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
	private Date datetrans;
	
	@Column (name ="Valor") 
	private Double valor;
	
	@Column (name = "Tipo") 
	private String servico;
	
	 
	
    public UserCont() {
		
	}
	public UserCont(String responsavel,String datetrans, Double valor, String servico) {
		super();
		this.nome_responsavel= responsavel;
		
		try {
			this.datetrans = new SimpleDateFormat("dd/MM/yyyy").parse(datetrans);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.valor = valor;
		this.servico = servico;
	}
	
	public String getNome_responsavel() {
		return nome_responsavel;
	}
	public void setNome_responsavel(String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	}
	public Long getId_conta() {
		return id_conta;
	}
	public void setId_conta(Long id_conta) {
		this.id_conta = id_conta;
	}
	public Date getDatetrans() {
		return datetrans;
	}
	public void setDatetrans(Date  datetrans) {
		this.datetrans = datetrans;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getServico() {
		return servico;
	}
	public void setServico(String servico) {
		this.servico = servico;
	}
	 
	 
}
