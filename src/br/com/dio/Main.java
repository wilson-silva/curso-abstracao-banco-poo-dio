package br.com.dio;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Wilson Gimenes da Silva");
		Cliente c2 = new Cliente("Francislaine Michele Cruz");

		Conta cc = new ContaCorrente(c1);
		cc.depositar(100);

		Conta cp = new ContaPoupanca(c2);
		cc.transferir(50, cp);

		cc.imprimirExtrato();
		System.out.println("-----------------------------");
		cp.imprimirExtrato();
		
		System.out.println("-----------------------------");
		Banco bancoA = new Banco("Banco do Povo", "Rua Amélia, 45");
		System.out.println(bancoA);
		
		System.out.println("-----------------------------");
		
		List<Conta> contas = bancoA.getContas();
		contas.add(cp);
		contas.add(cc);
		
		System.out.println(contas);
		
		
		
	}

}
