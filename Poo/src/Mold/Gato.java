package Mold;

import java.time.LocalDate;

public class Gato {
	public int idade, qntPatas;
	public String nome, cor, raca;
	public float peso;
	public LocalDate nascimento; 
	
	public String miar(){
		return("miau miau");
	}
	
	public boolean isVivo() {
		if(idade > 15)
			return false;
		
		return true;
	}
}
