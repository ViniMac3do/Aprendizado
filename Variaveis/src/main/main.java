package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Entendendo as variaveis
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Escreva a sua idade:");
		int idade = scanner.nextInt();
		
		System.out.println("Escreva o seu nome:");
		String nome = scanner.next();
		
		System.out.println("Nome: " + nome + " Idade:" + idade);

	}

}
	