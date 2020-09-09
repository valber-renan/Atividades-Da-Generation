package atividades;

import java.util.Scanner;

public class Tresinteiros {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, r, s;
		System.out.println("Digite o primeiro numero");
		a = ler.nextInt();
		System.out.println("Digite o segundo numero");
		b = ler.nextInt();
		System.out.println("Digite o terceiro numero");
		c = ler.nextInt();
		r = (int) Math.pow(a+b,2);
		s = (int) Math.pow(b+c,2);
		d = (r+s)/2;
		System.out.println("o valor de r foi: "+r);
		System.out.println("o valor de s foi: "+s);		
		System.out.print(r+"+"+s+"/2 = "+d);
	}
}