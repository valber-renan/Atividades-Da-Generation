package atividades;

import java.util.Scanner;

public class Multiplos3 {
	public static void main (String args[])
	{
		Scanner ler= new Scanner (System.in);
		int num, mult=0,med=0,total=0;
		do 
		{
			System.out.println("Digite um numero:..");
			num = ler.nextInt();
			if (num%3==0&&num!=0)
			{
				
				mult=mult+num;
				med=med+1;
			}
			
		}while(num !=0);
		total=mult/med;
		System.out.println("a média dos numeros digitados foi de: "+total);
	}
}
