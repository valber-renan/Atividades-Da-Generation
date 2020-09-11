package atividades;

import java.util.Scanner;

/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.*/

public class Matriz2 {
	public static final int hd = 5;
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		float[][] Matriz1 = new float[2][2];
		float[][] Matriz2 = new float[2][2];
		float[][] MatrizS = new float[2][2];
		int opcao;
		
		for (int linha=0;linha<2;linha++)
		{
			for (int coluna=0;coluna<2;coluna++)
			{
				System.out.println("Digite um numero :...");
				Matriz1[linha][coluna]=ler.nextInt();
			}
		}
		for (int linha=0;linha<2;linha++)
		{
			for (int coluna=0;coluna<2;coluna++)
			{
				System.out.println("Digite um numero :...");
				Matriz2[linha][coluna]=ler.nextInt();
			}
		}
		System.out.println("menu de opções:\r\n" + 
				"(1) somar as duas matrizes\r\n" + 
				"(2) subtrair a primeira matriz da segunda\r\n" + 
				"(3) adicionar uma constante as duas matrizes\r\n" + 
				"(4) imprimir as matrizes");
		opcao = ler.nextInt();
		if (opcao==1)
		{
			for (int linha=0;linha<2;linha++)
			{
				for (int coluna=0;coluna<2;coluna++)
				{
					MatrizS[linha][coluna]=( Matriz1[linha][coluna]+Matriz2[linha][coluna]);
					System.out.print(MatrizS[linha][coluna]+" ");
				}
				System.out.println();
		}}
			else if (opcao==2)
		{
			for (int linha=0;linha<2;linha++)
			{
				for (int coluna=0;coluna<2;coluna++)
				{
					MatrizS[linha][coluna]=( Matriz1[linha][coluna]-Matriz2[linha][coluna]);
					System.out.print(MatrizS[linha][coluna]+" ");
				}
				System.out.println();
			}	
	}
			else if (opcao==3)
			{
				for (int linha=0;linha<2;linha++)
				{
					for (int coluna=0;coluna<2;coluna++)
					{
						Matriz1[linha][coluna]=( Matriz1[linha][coluna]+hd);
						System.out.print(Matriz1[linha][coluna]+" \t");
						
					}
					System.out.println();
				}
				System.out.println(" Matriz 2");
				for (int linha=0;linha<2;linha++)
				{
					for (int coluna=0;coluna<2;coluna++)
					{
						Matriz2[linha][coluna]=( Matriz2[linha][coluna]+hd);
						System.out.print(Matriz2[linha][coluna]+" \t");
						
					}
					System.out.println();
				}
			}
			else if(opcao==4)
			{
				for (int linha=0;linha<2;linha++)
				{
					for (int coluna=0;coluna<2;coluna++)
					{
						System.out.print(Matriz1[linha][coluna]+" \t");
					}
					System.out.println();
				}
				System.out.println(" Matriz 2");
				for (int linha=0;linha<2;linha++)
				{
					for (int coluna=0;coluna<2;coluna++)
					{
						System.out.print(Matriz2[linha][coluna]+" \t");
						
					}
					System.out.println();
				}
			}


}
}
