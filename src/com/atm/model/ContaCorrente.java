package com.atm.model;

public class ContaCorrente {
	private Double saldo;
	private Pessoa pessoa;
	public ContaCorrente(double saldo) {
		this.saldo=saldo;
		// TODO Auto-generated constructor stub
	}
	public boolean saque(double valor,Pessoa pessoa) {
		if(valor> 0 && saldo >=valor) {
			saldo= saldo - valor; 
			return true;
		}
		return false;
	}
	public boolean deposito(double valor, Pessoa pessoa) {
		if(valor>0) {
			saldo=saldo+valor;
			return true;
		}
		return false;
	}
	public boolean transferencia(double valor, Pessoa pessoa,Pessoa pessoaDeDestino) {
		if(valor>0) {
			saldo=saldo-valor;
			return true;
		}
		return false;
	}
	public Double getSaldo() {
		return saldo;
	}
}
