package atividades;

import java.util.Scanner;

/*1- Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

public class Vetor1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int [] arrayA = {1,0,5,-2,-5,7};
		int soma,mod=100,i;
		soma = (arrayA[0]+arrayA[1]+arrayA[5]);
		System.out.println("A soma dos valores � igual a "+soma);
		arrayA[4]=mod;
		for (i=0;i<6;i++)
		System.out.println("posi��o "+i+"["+arrayA[i]+"]");
		
	}
}
