package Mold;

import java.time.LocalDate;

public class Cachorro extends Animal{
	
	public Cachorro() {
		super();
	}




	
	public Cachorro(int idade, int qntdPatas, String raca, LocalDate nascimento, String nome, float peso, String cor) {
		super(idade, qntdPatas, raca, nascimento, nome, peso, cor);
		
	}





	public String latir() {
		return("au au aua uaa ua au aua ua");
	}
	
	public String correr() {
		return ("Ploft ploft ploft");
	}
	
	public boolean isVivo() {
		if(getIdade() > 18)
			return false;
		
		return true;
	}





	@Override
	public String toString() {
		return "Cachorro [getIdade()=" + getIdade() + ", getQntdPatas()=" + getQntdPatas() + ", getRaca()=" + getRaca()
				+ ", getNascimento()=" + getNascimento() + ", getNome()=" + getNome() + ", getPeso()=" + getPeso()
				+ ", getCor()=" + getCor() + ", respirar()=" + respirar() + "]";
	}

}
