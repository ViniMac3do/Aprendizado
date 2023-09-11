package Main2;

import javax.swing.JOptionPane;
import java.time.LocalDate;

import Mold.Cachorro;
import Mold.Cavalo;
import Mold.Gato;
import Mold.Gorila;
import Mold.Marcelo;

public class Main {
	public static void main(String[] args) {
		Cachorro negao = new Cachorro(12,4,"pinscher",LocalDate.of(2011, 1, 30),"negao",2f,"preto");

		Cavalo valente = new Cavalo(25,4,"sla", LocalDate.of(1998, 2, 4), "valente", 100f, "preto com listras brancas");

		Gato floquinho = new Gato(10,4,"gato branco", LocalDate.of(2013, 07, 07), "floquinho", 5f, "branco");

		Gorila kong = new Gorila(30,0,"gorila da montanha" , LocalDate.of(1993, 10, 20), "kong", 150f, "preto");

		Marcelo marcelo = new Marcelo(45, 0, null, LocalDate.of(1980, 02, 20), "marcelo",  80f,  "kkkkkk", "Progamado (Programa-a-dô)");

		String[] Classe = new String[5];
		Classe[0] = negao.toString();
		Classe[1] = valente.toString();
		Classe[2] = floquinho.toString();
		Classe[3] = kong.toString();
		Classe[4] = marcelo.toString();

		int c = 0;
		while (c != 5) {
			System.out.println(Classe[c]);
			c++;
		}
	}
}
