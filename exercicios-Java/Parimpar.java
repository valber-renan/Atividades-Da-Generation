package atividades;

import java.util.Scanner;

public class Parimpar {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int a,cont,impar=0,par=0;
		
		
		
		for(cont=1;cont<=10;cont++)
		{
			System.out.println("Digite um numero");
			a= ler.nextInt();
			if (a%2==0)
			{
				par = par+1;
			}
			else 
			{
				impar = impar+1;
			}
		}
		System.out.println("O total de numeros par(es) foi de: "+par);
		System.out.println("O total de numeros impar(es) foi de: "+impar);
	}
}
