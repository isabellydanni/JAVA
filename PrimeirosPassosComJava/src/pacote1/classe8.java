package pacote1;

//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
//percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
//escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
//consumidor.

import java.util.Scanner;

public class classe8 {
	public static void main (String args[])
	{
	Scanner ler = new Scanner (System.in);
	int cf,porc1,porc2,total;
	
	System.out.println("Custo de fábrica:  ");
		cf = ler.nextInt();
		porc1 = cf*45/100;
		porc2 = cf*28/100;
		total = cf+porc1+porc2;
				
	System.out.println("\nCusto total : "+total);

		
		
	}
}
