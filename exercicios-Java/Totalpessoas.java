package atividades;

import java.util.Scanner;

public class Totalpessoas {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade ,jov=0,vov=0,invalida=0;
		
		System.out.println("Informe sua idade:...");
		idade= ler.nextInt();
		while (idade!=-99)
		{
			System.out.println("Informe sua idade:...");
			idade= ler.nextInt();
			if(idade>0&&idade<21)
			{
				jov=jov+1;
			}
			else if (idade>50)
			{
				vov=vov+1;
			}
			else if (idade<0)
			{
				invalida= invalida+1;
			}
			else  
			{
				invalida= invalida+1;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos foi de "+jov);
		System.out.println("Total de pessoas com mais de 50 anos foi de "+vov);
		System.out.println("Total de pessoas com idade fora da pesquisa foi de "+invalida);
	}
	
}
