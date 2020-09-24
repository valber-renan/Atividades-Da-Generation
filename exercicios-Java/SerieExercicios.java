package atividades;

import java.util.Scanner;

public class SerieExercicios {
	public static void main (String args[])
	{
		int totaldias, ano, mes, dias;
		String nome;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite seu nome :");
		nome = ler.next();
		System.out.println("Digite total de dias vividos :");
		totaldias= ler.nextInt();
		ano= totaldias/365;
		System.out.println(ano);
		mes= (totaldias%365)/30;
		System.out.println(mes);
		dias = (totaldias%365)%30;
		System.out.println(dias);
		System.out.print("você "+ nome+" tem "+ano+" anos "+mes+" meses e "+dias+" dias");
		
				
	}
}
