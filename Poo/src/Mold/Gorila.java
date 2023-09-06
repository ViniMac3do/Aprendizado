package Mold;

import java.time.LocalDate;

public class Gorila {
	public int idade;
	public String raca, nome, cor;
	public float peso;
	public LocalDate nascimento;

	public String urrar() {
		return ("hua hua ha ha ha ");
	}

	public String baterNoPeito() {
		return ("pou pou pou pou");
	}

	public boolean isVivo() {
		if (idade > 50)
			return false;

		return true;
	}
}
