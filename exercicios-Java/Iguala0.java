package atividades;

import java.util.Scanner;

public class Iguala0 {
	public static void main (String args[])
	{
		Scanner ler= new Scanner (System.in);
		int num, soma=0;
		
		do 
		{
			System.out.println("Digite um numero:..");
			num = ler.nextInt();
			soma =soma +num;
			
		}while(num !=0);
		System.out.println("a soma dos numeros digitados foi de: "+soma);
	}
}
