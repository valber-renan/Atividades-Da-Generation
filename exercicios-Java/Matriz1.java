package atividades;

/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

import java.util.Scanner;

public class Matriz1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int[][] Matriz = new int[3][3];
		int maior=0;
		
		for (int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.println("Digite um numero :...");
				Matriz[linha][coluna]=ler.nextInt();
				if (Matriz[linha][coluna]>10)
				{
					maior = maior+1;
				}
			}

		}
		for (int linha=0;linha<3;linha++)
		{
			for (int coluna=0;coluna<3;coluna++)
			{
				System.out.printf("\t %d \t",Matriz[linha][coluna]);
			}
			System.out.println();
		}
		System.out.println("A quantidade de valores maiores que 10 foi de: "+maior);
	}
}
