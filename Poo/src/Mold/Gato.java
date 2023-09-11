package Mold;

import java.time.LocalDate;

public class Gato extends Animal{

	public Gato() {
		super();
	}



	public Gato(int idade, int qntdPatas, String raca, LocalDate nascimento, String nome, float peso, String cor) {
		super(idade, qntdPatas, raca, nascimento, nome, peso, cor);
		// TODO Auto-generated constructor stub
	}



	public String miar() {
		return ("miau miau");
	}

	public boolean isVivo() {
		if (getIdade() > 15)
			return false;

		return true;
	}



	@Override
	public String toString() {
		return "Gato [getIdade()=" + getIdade() + ", getQntdPatas()=" + getQntdPatas() + ", getRaca()=" + getRaca()
				+ ", getNascimento()=" + getNascimento() + ", getNome()=" + getNome() + ", getPeso()=" + getPeso()
				+ ", getCor()=" + getCor() + "]";
	}
	
}
