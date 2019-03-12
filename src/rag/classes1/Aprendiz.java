package rag.classes1;

public class  Aprendiz {

	
	private int str;
	private int agi;
	private int vit;
	private int inte;
	private int dex;
	private int luk;
	
	
	private int habBasicas;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Getters e Setters
	
	
	public int getHabBasicas() {
		return habBasicas;
	}
	public void setHabBasicas(int habBasicas) {
		while(habBasicas < 0 || habBasicas > 9) { 
		this.habBasicas = habBasicas;
		if(habBasicas < 0 || habBasicas > 9) {
			System.out.println("A habilidade está apenas em um intervalo entre 0 e 9.");
		}
		
		}
	}
	
	
	public int getStr() {
		return str;
	}
	public void setStr(int str) {
		this.str = str;
		
		
	}
	public int getAgi() {
		return agi;
	}
	public void setAgi(int agi) {
		this.agi = agi;
	}
	
	
	public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	
	
	public int getInte() {
		return inte;
	}
	public void setInte(int inte) {
		this.inte = inte;
		
		
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	
	public int getLuk() {
		return luk;
	}
	public void setLuk(int luk) {
		this.luk = luk;
	}

	
	
	
	
	
	
	
}
