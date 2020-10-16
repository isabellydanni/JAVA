package pacote1;
//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

import java.util.Scanner;

public class classe3 {
	public static void main(String args[]) { 
		Scanner ler = new Scanner(System.in);
		int idade,menor21=0,maior50=0;
		
		System.out.println("Entre sua idade: ");
			idade = ler.nextInt();
			
		while (idade>1 && idade<=99) {
			
			if (idade>1 && idade<21) {
				System.out.println("\nVocê tem menos que 21 anos: ");
				menor21++;
			}
			else if (idade>=50){
				System.out.println("\nVocê tem mais de 50 anos: ");
				maior50++;
			}
			System.out.println("Entre sua idade: ");
			idade = ler.nextInt();
		}
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+menor21);
		System.out.println("\nTotal de pessoas com mais de 50 anos: "+maior50);
	}
}
