package rag.core;

import java.util.Scanner;



public class Controller {
	
	
	
	public Controller(Creator criador) {
		
		this.criador = criador;
	}
	  
	 Creator criador;
	  
	  
	 public void começoApp() {
		 
	ManipulacaoArquivos arqs = criador.newManip();	
			
	Scanner sc = criador.newScan();
		 
	int escolhaMain;
	
	 System.out.println("\nBem vindo ao programa de seleção de classe Ragnarök Online");

     System.out.println("Digite 1 para criar uma classe, 2 para uma descrição sobre as classes, 3 para observar classes criadas, 4 para sair: ");

    escolhaMain = sc.nextInt();
	
    this.escolhaMain(escolhaMain, arqs);
    
	 }
 
	 
	 
	 public void escolhaMain(int escolha, ManipulacaoArquivos arqs) {
		 
	
		switch(escolha) {
		
		
		case 1:
		
			arqs.criarTxt();
			
			break;
		
		
		case 2:
			
			break;
		
		
		case 3:
			
			break;
		
		
		case 4:
			
			System.out.println("Obrigado por utilizar o programa!!!");
			
			break;
		
		
		
		
		
		
		
		} 
		 
		 
		 
		 
		 
		 
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}
    

