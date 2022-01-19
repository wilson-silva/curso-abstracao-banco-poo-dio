package br.com.dio;

import java.util.ArrayList;
import java.util.List;


public class Banco {

	private String nome;
	private String endereco;
	private List<Conta> contas = new ArrayList<>();

	public Banco(String nome, String endereco) {

		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	@Override
	public String toString() {
		return "Banco \n" +
			   "Nome: " + nome + "\n" +
			   "Endereco: " + endereco;
	}
	
	

}
