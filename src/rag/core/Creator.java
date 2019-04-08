package rag.core;

import java.util.Scanner;

public class Creator {
	
	
	public Controller newController(Creator criador) {
	
		Controller control = new Controller(criador);
		
			return control;
	}
	
	public Scanner newScan() {
		
		Scanner sc = new Scanner(System.in);
		
			return sc;
	}

	
	public ManipulacaoArquivos newManip() {
		
		ManipulacaoArquivos manip = new ManipulacaoArquivos();
		
		return manip;
	}
}
