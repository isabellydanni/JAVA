package pacote1;

import java.util.Scanner;

public class classe2 {
	public static void main (String args[])
	{
	Scanner ler = new Scanner (System.in);
	int dt,d,a,m;
	System.out.println("Entre com sua idade total em dias: ");
	dt = ler.nextInt();
		a = (dt)/365;
	System.out.println("\nIdade em anos: "+a);
		m =(dt%365)/30;
	System.out.println("\nIdade em meses: "+m);
		d =(dt%365)%30;
	System.out.println("\nIdade em dias: "+d);
	}
}