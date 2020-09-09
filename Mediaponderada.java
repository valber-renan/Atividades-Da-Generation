package atividades;

import java.util.Scanner;

public class Mediaponderada {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		float n1,n2,n3,media;
		System.out.println("Digite a primeira nota");
		n1 = ler.nextInt();
		System.out.println("Digite a segunda nota");
		n2 = ler.nextInt();
		System.out.println("Digite a terceira nota");
		n3 = ler.nextInt();
		media = ((n1*2)+(n2*3)+(n3*5))/10;
		System.out.println("A media ponderada é: "+media);
	}
}
