package atividades;

import java.util.Scanner;

/*Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/

public class Vetor2 {
	public static void main (String args[])
	{
		Scanner ler= new Scanner(System.in);
		
		int []arrayNum=new int [6];
		int soma=0,quant=0,par=0,impar=0,j;
		
		for (int i =0;i<6;i++)
		{
			System.out.println("Digite um numero:..");
			arrayNum[i]= ler.nextInt();
			if (arrayNum[i]%2==0)
				
			{
				
				par=arrayNum[i];
				soma= soma+arrayNum[i];
				System.out.println("Numero par digitado: "+par);
				
			}
			else 
			{
				impar=arrayNum[i];
				System.out.println("Numero impar digitado: "+impar);
				quant=quant+1;
			}
			
		    
		}
		System.out.println("soma dos numeros pares = "+soma);
		System.out.println("quantidade dos numeros impares = "+quant);
		 
	}
}
