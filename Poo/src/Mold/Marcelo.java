package Mold;

import java.time.LocalDate;

public class Marcelo extends Animal{

	public Marcelo() {
		super();
	}


	public Marcelo(int idade, int qntdPatas, String raca, LocalDate nascimento, String nome, float peso, String cor, String profissao) {
		super(idade, qntdPatas, raca, nascimento, nome, peso, cor);
		
		// TODO Auto-generated constructor stub
	}


	private String profissao;

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String reclamar() {
		return ("Voce ta burro em menino/a");
	}

	public String programar() {
		return ("E voce, vai aprende a programa java quando?");
	}


	@Override
	public String toString() {
		return "Marcelo [profissao=" + profissao + ", getIdade()=" + getIdade() + ", getNascimento()=" + getNascimento()
				+ ", getNome()=" + getNome() + ", getPeso()=" + getPeso() + "]";
	}
	
}
