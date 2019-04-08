package rag.core;


public class App {

	

    public static void main(String[] args) {

    	
    	Creator criador = new Creator();
    	
    	
    	Controller control = criador.newController(criador);
    	
    	control.começoApp();

    	
    }
}
