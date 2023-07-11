package com.java;

public class TesteConta {

	public static void main(String[] args) {

		Conta contaCorrente = new Conta ();
		Conta contaPoupanca = new Conta ();
		Conta contaInvestimento = new Conta ();

		contaCorrente.numero = 11;
		contaCorrente.saldo = 20.50;
		contaCorrente.cliente.nome = "Antonio";
		contaCorrente.cliente.idade = 31;		

		contaPoupanca.numero = 32;
		contaPoupanca.saldo = 30;	
		contaPoupanca.cliente.nome = "AntonioN";
		contaPoupanca.cliente.idade = 31;

		contaInvestimento.numero = 33;
		contaInvestimento.saldo = 40;
		contaInvestimento.cliente.nome = "AntonioNovais";
		contaInvestimento.cliente.idade = 31;


		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);





	}




}
