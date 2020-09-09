package atividades;

import java.util.Scanner;

public class Categoria {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		System.out.println("Informe seu nome: ");
		nome = ler.nextLine();
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		if (idade>10 && idade <15)
		{
			System.out.println(nome+" sua Categoria é infantil");
		}
		else if (idade>15 && idade <18)
		{
			System.out.println(nome+" sua Categoria é juvenil");
		}
		else if (idade>18 && idade<25)
		{
			System.out.println(nome+" sua Categoria é adulto");
		}
		else
		{
			System.out.println(nome+" sua Categoria é inválida");
		}
	}
}
