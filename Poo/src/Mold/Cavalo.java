package Mold;

import java.time.LocalDate;

public class Cavalo extends Animal{
	
	public Cavalo() {
		super();
	}

	

	public Cavalo(int idade, int qntdPatas, String raca, LocalDate nascimento, String nome, float peso, String cor) {
		super(idade, qntdPatas, raca, nascimento, nome, peso, cor);
		// TODO Auto-generated constructor stub
	}

	private int qntdFerraduras;
	
	public int getQntdFerraduras() {
		return qntdFerraduras;
	}

	public void setQntdFerraduras(int qntdFerraduras) {
		this.qntdFerraduras = qntdFerraduras;
	}



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
		if (getIdade() > 25)
			return false;

		return true;
	}



	@Override
	public String toString() {
		return "Cavalo [qntdFerraduras=" + qntdFerraduras + ", getIdade()=" + getIdade() + ", getQntdPatas()="
				+ getQntdPatas() + ", getRaca()=" + getRaca() + ", getNascimento()=" + getNascimento() + ", getNome()="
				+ getNome() + ", getPeso()=" + getPeso() + ", getCor()=" + getCor() + ", respirar()=" + respirar()
				+ "]";
	}
	
	
}
