package pacote1;

import java.util.Scanner;

public class classe1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int a, m, d, dt;
		System.out.println("Entre com sua idade em anos: ");
		a = ler.nextInt();
		System.out.println("Entre com sua idade em meses: ");
		m = ler.nextInt();
		System.out.println("Entre com sua idade em dias: ");
		d = ler.nextInt();
		dt = (a * 365 + m * 30 + d * 1);
		System.out.println(dt);
	}
}