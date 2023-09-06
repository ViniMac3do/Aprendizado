package Mold;

import java.time.LocalDate;

public class Cachorro {
	public int qntdPatas, idade;
	public LocalDate nascimento; 
	public String raca, nome;
	public float peso;
	
	public String latir() {
		return("au au aua uaa ua au aua ua");
	}
	
	public String correr() {
		return ("Ploft ploft ploft");
	}
	
	public boolean isVivo() {
		if(idade > 18)
			return false;
		
		return true;
	}
}
