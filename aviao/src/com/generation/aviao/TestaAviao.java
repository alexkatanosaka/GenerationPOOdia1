package com.generation.aviao;

import com.generation.aviao.model.Aviao;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao("Alex","boing","São Paulo",
				"Rio de Janeiro",123);
	
		
		System.out.println(aviao.toString());
		
	}
	
}
