package com.generation.clientes.model;

public class Cliente {

	private int id, telefone;
	private String cpf, nome, endereco, email;
	
	public Cliente(int id, int telefone, String cpf, String nome, String endereco, String email) {
		this.id = id;
		this.telefone = telefone;
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
	}
	
	public Cliente() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", telefone=" + telefone + ", cpf=" + cpf + ", nome=" + nome + ", endereco="
				+ endereco + ", email=" + email + "]";
	}
	
	
	
	
}
