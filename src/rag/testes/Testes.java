package rag.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import rag.classes2.Sabio;

public class Testes {

	
	
	@Test 
	
	void funcionaInte() {
		
		int intTeste = 50;
		
		Sabio teste = new Sabio();
		
		teste.setInte(50);
		
		
		assertEquals(intTeste, teste.getInte());
		
	
	}
	

	
}