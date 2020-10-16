package pacote1;

//Um sistema de equações lineares do tipo:

import java.util.Scanner;

public class classe7 {
	public static void main (String args[])
	{
	Scanner ler = new Scanner (System.in);
	int a,b,c,d,e,f,x,y;
	
	System.out.println("Entre com o a:  ");
		a = ler.nextInt();
	System.out.println("Entre com o b:  ");
		b = ler.nextInt();
	System.out.println("Entre com o c:  ");
		c = ler.nextInt();
	System.out.println("Entre com o d:  ");
		d = ler.nextInt();
	System.out.println("Entre com o e:  ");
		e = ler.nextInt();
	System.out.println("Entre com o f:  ");
		f = ler.nextInt();
		
	x=c*e-b*f/a*e-b*d;
	y=a*f-c*d/a*e-b*d;
	
	System.out.println("\n X =  "+x+" e Y = "+y);
		
	}
}
