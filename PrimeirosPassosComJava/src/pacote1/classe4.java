package pacote1;
//Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:


import java.util.Scanner;

public class classe4 {
	public static void main (String args[])
	{
	Scanner ler = new Scanner (System.in);
	int A,B,C,D,R,S;
	System.out.println("Escreva com o valor de A:  ");
		A = ler.nextInt();
	System.out.println("Escreva com o valor de B:  ");
		B = ler.nextInt();
	System.out.println("Escreva com o valor de C:  ");
		C = ler.nextInt();
		
		R=(A+B)*(A+B);
		S=(B+C)*(B+C);
		
		D=(R+S)/2;
		
		System.out.println("D= "+D);
	
		}
}