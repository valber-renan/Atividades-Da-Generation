package atividades;

import java.util.Scanner;

public class Par {
	public static void main (String args[])
	{
		Scanner ler= new Scanner (System.in);
		int n1;
		double raiz,potencia;
		System.out.println("Informe o valor:..");
		n1= ler.nextInt();
		if (n1%2==0)
		{
			System.out.println("O numero � par!!!");
			raiz= Math.sqrt(n1);
			System.out.printf(" A raiz quadrada do valor � %.2f", raiz);
		}
		else 
		{
			System.out.println("O numero � impar!!!");
			potencia= Math.pow(n1, 2);
			System.out.println(" A pot�ncia do valor � "+potencia);
		}
	}
}
