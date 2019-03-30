package com.atm.model;
import java.time.LocalDate;

public class Pessoa {
	private String nomeDoCliente;
	private String cpf;
	private LocalDate dataDeNascimento;

	public Pessoa(String nomeDoCliente, String cpf, LocalDate dataDeNascimento) {
		this.nomeDoCliente=nomeDoCliente;
		this.cpf=cpf;
		this.dataDeNascimento=dataDeNascimento;
		// TODO Auto-generated constructor stub
	}
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	 
}
