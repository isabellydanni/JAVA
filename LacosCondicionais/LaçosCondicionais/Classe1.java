package La�osCondicionais;
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class Classe1 {
	public static void main(String args[]) { 
		Scanner ler = new Scanner(System.in);
		int intA,intB,intC,maior;
		System.out.println("Entre com o primeiro n�mero: ");
			intA = ler.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
			intB = ler.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
			intC = ler.nextInt();
			maior =intA;
		if (intB>maior){
			maior=intB;
		}
		if (intC>maior) {
			maior=intC;
		}
		System.out.printf("Maior n�mero: %d ",maior);
	}
}
