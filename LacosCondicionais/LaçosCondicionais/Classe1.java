package LaçosCondicionais;
//Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Classe1 {
	public static void main(String args[]) { 
		Scanner ler = new Scanner(System.in);
		int intA,intB,intC,maior;
		System.out.println("Entre com o primeiro número: ");
			intA = ler.nextInt();
		System.out.println("Entre com o segundo número: ");
			intB = ler.nextInt();
		System.out.println("Entre com o terceiro número: ");
			intC = ler.nextInt();
			maior =intA;
		if (intB>maior){
			maior=intB;
		}
		if (intC>maior) {
			maior=intC;
		}
		System.out.printf("Maior número: %d ",maior);
	}
}
