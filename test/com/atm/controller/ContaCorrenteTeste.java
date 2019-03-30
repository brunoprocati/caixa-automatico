package com.atm.controller;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import com.atm.model.ContaCorrente;
import com.atm.model.Pessoa;

public class ContaCorrenteTeste {
	
	private Double valor= 100.0;
	private Pessoa julinho = new Pessoa("julinho ","01234567890", LocalDate.of(1988,8, 8));
	private Pessoa marquinhos = new Pessoa("marquinhos ","09876543210", LocalDate.of(1989,8, 8));
	@Test
	public void retornaFalseCasoRealizeUmSaqueComSaldoInsuficiente() {
		Double valor=100.0;
		Double saldoEsperado = 0.0;
		ContaCorrente contaCorrente = new ContaCorrente(0.0);
		Assert.assertFalse(contaCorrente.saque(valor,julinho));
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldo());
	}
	@Test
	public void retornaTrueCasoRealizeUmSaqueComSaldoSuficiente() {
		Double valor = 100.0;
		Double saldoEsperado = 400.0;
		ContaCorrente contaCorrente = new ContaCorrente(500.0);
		Assert.assertTrue(contaCorrente.saque(valor,julinho));
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldo());
	}
	@Test
	public void retornaFalseCasoRealizeUmSaqueComValorDeSaqueZero() {
		Double valor = 0.0;
		Double saldoEsperado =100.0;
		ContaCorrente contaCorrente = new ContaCorrente(100.0);
		Assert.assertFalse(contaCorrente.saque(valor, julinho));
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldo());
	}
	@Test
	public void retornaFalseCasoRealizeUmDepositoComValorDeDepositoZero() {
		Double valor = 0.0;
		Double saldoEsperado= 100.0;
		ContaCorrente contaCorrente = new ContaCorrente(100.0);
		Assert.assertFalse(contaCorrente.deposito(valor, julinho));
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldo());
	}
	@Test
	public void retornaTrueCasoRealizeUmDepositoComValorDeDepositoMaiorQueZero() {
		Double valor = 228.0;
		Double saldoEsperado= 328.0;
		ContaCorrente contaCorrente = new ContaCorrente(100.0);
		Assert.assertTrue(contaCorrente.deposito(valor, julinho));
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldo());
	}
	@Test
	public void retornaTrueCasoRealizeUmaTransferenciaComValorMaiorQueZero() {
		Double valor = 100.0;
		Double saldoEsperadodaContaCorrenteAposTransferencia = 0.0;
		ContaCorrente contaCorrente = new ContaCorrente (100.0);
		Assert.assertTrue(contaCorrente.transferencia(valor, julinho, marquinhos));
		Assert.assertEquals(saldoEsperadodaContaCorrenteAposTransferencia, contaCorrente.getSaldo());
		}
	@Test
	public void retornaFalseCasoRealizeUmaTransferenciaComValorMaiorQueZero() {
		Double valor = 100.0;
		Double saldoEsperadodaContaCorrenteAposTransferencia = 0.0;
		ContaCorrente contaCorrente = new ContaCorrente (100.0);
		Assert.assertTrue(contaCorrente.transferencia(valor, julinho, marquinhos));
		Assert.assertEquals(saldoEsperadodaContaCorrenteAposTransferencia, contaCorrente.getSaldo());
		}
	@Test
	public void RetornoFalseCasoRealizeUmaTRansferenciaComValorDeZero() {
		Double valorDaTansferencia = 0.0;
		Double saldoEsperadodaContaCorrenteAposTransferencia = 100.0;
		ContaCorrente contaCorrente = new ContaCorrente (100.0);
		Assert.assertFalse(contaCorrente.transferencia(valor,julinho,marquinhos));
		Assert.assertEquals(saldoEsperadodaContaCorrenteAposTransferencia,contaCorrente.getSaldo());
	}
	

}
