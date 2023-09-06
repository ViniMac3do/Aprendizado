package Mold;

import java.time.LocalDate;

public class Cavalo {
	public int idade, qntdPatas, qntdFerraduras;
	public String nome, cor;
	public float peso;
	public LocalDate nascimento; 

	public String relinxar() {
		return ("hihihihiha");
	}

	public String andar() {
		return ("Pocoto... pocoto... pocoto...");
	}

	public String correr() {
		return ("pocoto pocoto pocoto pocoto pocoto");
	}
	
	public boolean isVivo() {
		if(idade > 25)
			return false;
		
		return true;
	}
}
