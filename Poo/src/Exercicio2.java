import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("  Insira um numero");
		int a = in.nextInt();
		System.out.println("Tabuada ate " + calcular(a));
		in.close();
	}

	private static int calcular(int a) {

		for (int i = 1; i <= a; i++) {
			int c = 1, v = 0;
			while (c < 11) {
				v = i * c;
				System.out.println(i + "X" + c + "=" + v);
				c++;
			}

			System.out.println("\n");
		}

		return a;
	}
}