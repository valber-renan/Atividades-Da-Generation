package atividades;

import java.util.Scanner;

/*1- Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/

public class Vetor1 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int [] arrayA = {1,0,5,-2,-5,7};
		int soma,mod=100,i;
		soma = (arrayA[0]+arrayA[1]+arrayA[5]);
		System.out.println("A soma dos valores é igual a "+soma);
		arrayA[4]=mod;
		for (i=0;i<6;i++)
		System.out.println("posição "+i+"["+arrayA[i]+"]");
		
	}
}
