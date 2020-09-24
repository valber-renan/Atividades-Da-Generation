package atividades;

import java.util.Scanner;

public class Caracteristicas {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade,genero,masc=0,fem=0,out=0,cons=0,calmo=0,nerv=0,agre=0,mn=0,ha=0;
		
		System.out.println("Digite sua idade");
		idade = ler.nextInt();
		while(idade>0)
		{
			System.out.println("Digite o numero do seu genero (1-feminino / 2-masculino / 3-Outros)");
			genero= ler.nextInt();
			if (genero==1)
			{
				masc=masc+1;
			}
			else if (genero==2)
			{
				fem=fem+1;
			}
			else if(genero==3)
			{
				out = out+1;
			}
			else 
			{
				System.out.println("valor inválido");
			}
			System.out.println("Voce se considera (1-calmo(a) / 2-nervoso(a) / 3-agressivo(a)");
			cons = ler.nextInt();
			if (cons==1)
			{
				calmo=calmo+1;
			}
			else if (cons==2)
			{
				nerv=nerv+1;
			}
			else if(cons==3)
			{
				agre=agre+1;
			}
			else 
			{
				System.out.println("valor inválido");
			}
			if (fem==1&&nerv==1)
			{
				mn=mn+1;
			}
			if (masc==1&&agre==1)
			{
				ha=ha+1;
			}
		}
	}
}
