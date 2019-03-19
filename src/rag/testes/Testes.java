package rag.testes;


import org.junit.jupiter.api.Test;

import rag.classes2.Sabio;

public class Testes {

	
	static Sabio teste = new Sabio();

	
	
	@Test
	public static void testao() {
		
		
		teste.setInte(50);
		
		
		teste.getInte();
		
	
			
		
	
	}
	



	public static void main (String [] args) {
	
	testao();
	 
	System.out.println(""+teste.getInte());
	
}

}