package atividades;

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

import java.util.Scanner;


public class Maior {
	public static void main (String args[])
	{
		Scanner ler =new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("Digite o primeiro numero...");
		n1 = ler.nextInt();
		System.out.print("Digite o segundo numero...");
		n2 = ler.nextInt();
		System.out.print("Digite o terceiro numero...");
		n3 = ler.nextInt();
		if (n1>n2&&n1>n3)
		{
			System.out.println("O numero maior �: "+n1);
			
		}
		else if (n2>n1&&n2>n3)
		{
			System.out.println("O numero maior �: "+n2);
		}
		else if(n3>n1&&n3>n2)
		{
			System.out.println("O numero maior �: "+n3);
		}
		else if (n1==n2||n1==n3)
		{
			System.out.println("O numero maior �:"+n1);
		}
		else if (n2==n1||n2==n3)
		{
			System.out.println("O numero maior �:"+n2);
		}
		else if (n3==n2||n3==n1)
		{
			System.out.println("O numero maior �:"+n3);
		}
		else
		{
			System.out.println("Informa��o Inv�lida...");
		}
	}
}
