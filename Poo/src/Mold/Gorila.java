package Mold;

import java.time.LocalDate;

public class Gorila extends Animal{
	
	public Gorila() {
		super();
	}

	


	public Gorila(int idade, int qntdPatas, String raca, LocalDate nascimento, String nome, float peso, String cor) {
		super(idade, qntdPatas, raca, nascimento, nome, peso, cor);
		// TODO Auto-generated constructor stub
	}




	public String urrar() {
		return ("hua hua ha ha ha ");
	}

	public String baterNoPeito() {
		return ("pou pou pou pou");
	}

	public boolean isVivo() {
		if (getIdade() > 50)
			return false;

		return true;
	}




	@Override
	public String toString() {
		return "Gorila [getIdade()=" + getIdade() + ", getQntdPatas()=" + getQntdPatas() + ", getRaca()=" + getRaca()
				+ ", getNascimento()=" + getNascimento() + ", getNome()=" + getNome() + ", getPeso()=" + getPeso()
				+ ", getCor()=" + getCor() + "]";
	}
	
}
