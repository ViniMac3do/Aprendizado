package Main2;

import java.time.LocalDate;

import Mold.Cachorro;
import Mold.Cavalo;
import Mold.Gato;
import Mold.Gorila;
import Mold.Marcelo;

public class Main {
public static void main(String[] args) {
	Cachorro negao = new Cachorro();
	negao.idade = 10;
	negao.nome = "Negao" ;
	negao.peso = 15f;
	negao.qntdPatas = 4;
	negao.raca = "Pitbull";
	negao.nascimento = LocalDate.of(2013, 3, 12);
	
	Cavalo valente = new Cavalo();
	valente.cor = "Preto com listra branca";
	valente.idade = 20;
	valente.nascimento = LocalDate.of(2003, 2, 2);
	valente.nome = "Valente";
	valente.peso = 200f;
	valente.qntdFerraduras = 4;
	valente.qntdPatas = 4;
	
	Gato floquinho = new Gato();
	floquinho.cor= "branca";
	floquinho.idade= 23;
	floquinho.nascimento= LocalDate.of(2003, 05, 07);
	floquinho.nome= "floquinho";
	floquinho.peso= 3f;
	floquinho.qntPatas= 4;
	floquinho.raca= "branco";
	
	Gorila kong = new Gorila();
	kong.cor = "preto";
	kong.idade= 30;
	kong.nascimento= LocalDate.of(1997, 9, 2);
	kong.nome= "kong";
	kong.peso= 310f;
	kong.raca= "Gorila da montanha";
	
	Marcelo marcelo = new Marcelo();
	marcelo.idade= 48;
	marcelo.nascimento= LocalDate.of(1989, 3, 3);
	marcelo.nome="Marcelo";
	marcelo.peso=80f;
	marcelo.profissao= "Programado (Programa-a-dô)";
	
	String [] Classe =  new String[5];
	Classe[0] = negao.nome;
	Classe[1] = valente.nome;
	Classe[2] = floquinho.nome;
	Classe[3] = kong.nome;
	Classe[4] = marcelo.nome;
	
	int c = 0;
	while(c != 5) {
		System.out.println(Classe[c]);
		c++;
	}
	}
}
