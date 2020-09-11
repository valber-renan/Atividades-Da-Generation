package atividades;

import java.util.Scanner;

/*Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/

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
