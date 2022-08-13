package com.generation.clientes;

import com.generation.clientes.model.Cliente;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(1,952414203,
				"123456789-12","Alex","Rua do limão",
				"alex@gmail.com");
		
		System.out.println(cliente.toString());
		
		
		
		
	}
	
}
