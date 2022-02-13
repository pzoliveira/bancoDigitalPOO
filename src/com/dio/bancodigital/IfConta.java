package com.dio.bancodigital;

public interface IfConta {

void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, IfConta contaDestino);
	
	void imprimirExtrato();
	
}
