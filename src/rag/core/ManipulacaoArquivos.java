package rag.core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ManipulacaoArquivos {
	
	
	
	
	
	public void criarTxt() {
		
		String Local = "H:\\Arquivos\\Guigui\\RagnaChoices\\Classes.txt";
		
		File arq = new File(Local);
		
		if(!arq.exists()) {
			
			
		
		
			BufferedWriter escrever;
			try {
				escrever = new BufferedWriter(new FileWriter(arq));
				
				escrever.flush();
				
				escrever.write("Teste");
				
				escrever.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
	
		}
		else {
			
			System.out.println("O arquivo já existe, próximo passo.");
		}
	}
	
	
	
	
	
	public void escreverTxt() {
		
		
		
		
		
		
		
		
		
	}
	
	

}
