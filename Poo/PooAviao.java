package aprendendoPoo;

import java.util.Scanner;

/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class PooAviao {
	Scanner ler = new Scanner(System.in);
	
	String tamanho;
	String marca;
	String cor;
	int velocidadeAtual;
	int classe;
	
	public Scanner getLer() {
		return ler;
	}
	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getClasse() {
		return classe;
	}
	public void setClasse(int classe) {
		this.classe = classe;
	}
	
	void decola()
	{
		System.out.println("Preparando para decolar...");
	}
	void acelera(int vel)
	{
		int velocidadeNova = this.velocidadeAtual+vel;
		this.velocidadeAtual = velocidadeNova;
	}
	void mostraClasse(int cla)
	{
		System.out.println("Escolha o numero da sua classe");
		classe = ler.nextInt();

			int classeAtual = this.classe+cla;
			this.classe = classeAtual;
			if (classe==1)
			{
				System.out.println("Primeira Classe");
			}
			else if (classe==2)
			{
				System.out.println("Segunda Classe");
			}
			else if (classe==3)
			{
				System.out.println("Classe economica");
			}
			else 
			{
				System.out.println("Você perdeu este voo por favor contate a companhia");
			}

	}

}
