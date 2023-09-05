import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String resp, name;
		Integer c = 0;
		Integer resp2;
		Integer resp3;
		String[][] dados = new String[9][3];

		do {
			// nome
			System.out.println("Insira o nome (apenas o primeiro nome)");
			name = in.next();
			dados[c][0] = name;
			// rg
			System.out.println("Insira o rg");
			resp2 = in.nextInt();
			dados[c][1] = resp2.toString();
			//id
			System.out.println("Insira o ID (1 a 10)");
			resp3 = in.nextInt();
			dados[c][2] = resp3.toString();
			
			
			// .
			c++;
			System.out.println("Quer continuar? (sim/nao)");
			resp = in.next();
			if (resp.equalsIgnoreCase("sim")) {
				continue;
			} else {
				break;
			}

		} while (true);
		//procurar pelo indice
		System.out.println("digite o ID de quem queira procurar");
		int fim = in.nextInt();
		switch (fim) {
		case 1:
			System.out.println(dados[0][0]);
			System.out.println(dados[0][1]);
			System.out.println(dados[0][2]);
			break;
		case 2:
			System.out.println(dados[1][0]);
			System.out.println(dados[1][1]);
			System.out.println(dados[1][2]);
			break;
		case 3:
			System.out.println(dados[2][0]);
			System.out.println(dados[2][1]);
			System.out.println(dados[2][2]);
			break;
		case 4:
			System.out.println(dados[3][0]);
			System.out.println(dados[3][1]);
			System.out.println(dados[3][2]);
			break;
		case 5:
			System.out.println(dados[4][0]);
			System.out.println(dados[4][1]);
			System.out.println(dados[4][2]);
			break;
		case 6:
			System.out.println(dados[5][0]);
			System.out.println(dados[5][1]);
			System.out.println(dados[5][2]);
			break;
		case 7:
			System.out.println(dados[6][0]);
			System.out.println(dados[6][1]);
			System.out.println(dados[6][2]);
			break;
		case 8:
			System.out.println(dados[7][0]);
			System.out.println(dados[7][1]);
			System.out.println(dados[7][2]);
			break;
		case 9:
			System.out.println(dados[8][0]);
			System.out.println(dados[8][1]);
			System.out.println(dados[8][2]);
			break;
		case 10:
			System.out.println(dados[9][0]);
			System.out.println(dados[9][1]);
			System.out.println(dados[9][2]);
			break;
		}
		in.close();
	}

}
