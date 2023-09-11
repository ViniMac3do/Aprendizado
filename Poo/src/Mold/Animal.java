package Mold;

import java.time.LocalDate;

public class Animal {
	
	//constructors
	public Animal() {
		super();
	}
	
	public Animal(int idade, int qntdPatas, String raca, LocalDate nascimento, String nome, float peso, String cor) {
		super();
		this.idade = idade;
		this.qntdPatas = qntdPatas;
		this.raca = raca;
		this.nascimento = nascimento;
		this.nome = nome;
		this.peso = peso;
		this.cor = cor;
	}
	
	
	public Animal(int idade, String raca, LocalDate nascimento, String nome, float peso, String cor) {
		super();
		this.idade = idade;
		this.raca = raca;
		this.nascimento = nascimento;
		this.nome = nome;
		this.peso = peso;
		this.cor = cor;
	}
	
	//atributos
	private int idade;
	private int qntdPatas;
	private String raca;
	private LocalDate nascimento;
	private String nome;
	private float peso;
	private String cor;

	//gettes e setters
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getQntdPatas() {
		return qntdPatas;
	}

	public void setQntdPatas(int qntdPatas) {
		this.qntdPatas = qntdPatas;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//metodos
	public String respirar() {
		return("enche plmão, esvazia pulmão");
	}
	public String locomover() {
		return("to transitando");
	}
}
