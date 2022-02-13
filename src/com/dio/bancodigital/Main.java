package com.dio.bancodigital;

public class Main {

	public static void main(String[] args) {

		Cliente pericles = new Cliente();
		pericles.setNome("Pericles");
		
		Conta cc = new ContaCorrente(pericles);
		Conta poupanca = new ContaPoupanca(pericles);
		Conta investimento = new ContaInvestimento(pericles);

		cc.depositar(100);
		cc.transferir(25, poupanca);
		cc.transferir(25, investimento);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		investimento.imprimirExtrato();

	}

}
