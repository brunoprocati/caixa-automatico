package com.atm.app;

import com.atm.model.Pessoa;

public class ContaCorrenteOperacoes { 
	
	public boolean saque(double valor,Pessoa pessoa) {
	if(valor> 0 && saldo >=valor) {
		this.saldo= saldo - valor; 
		return true;
	}
	return false;
}
	public boolean deposito(double valor, Pessoa pessoa) {
	if(valor>0) {
		saldo= saldo + valor;
		return true;
	}
	return false;
}
	public boolean transferencia(double valor, Pessoa pessoa,Pessoa pessoaDeDestino) {
	if(valor>0) {
		saldo= saldo - valor;
		return true;
	}
	return false;
}
	public Double getSaldo() {
	return saldo;
}
}

}
