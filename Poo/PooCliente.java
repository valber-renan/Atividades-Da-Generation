package aprendendoPoo;

import java.util.Scanner;

/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class PooCliente {
	Scanner ler= new Scanner(System.in);
	private String nomeCompleto; 
	private String cpf;
	private String endereco;
	private String telefone;
	double carteira,valorCarrinho;
	
	public PooCliente (String nome, String doc, String codp, String tel)
	{
		nomeCompleto= nome;
		cpf =doc;
		endereco = codp;
		telefone = tel;
	}
	
	public Scanner getLer() {
		return ler;
	}

	public void setLer(Scanner ler) {
		this.ler = ler;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getCarteira() {
		return carteira;
	}

	public void setCarteira(double carteira) {
		this.carteira = carteira;
	}

	public double getValorCarrinho() {
		return valorCarrinho;
	}

	public void setValorCarrinho(double valorCarrinho) {
		this.valorCarrinho = valorCarrinho;
	}

	public String getInfoCliente()
	{
		String cadastroCliente= nomeCompleto+" "+cpf+" "+endereco+" "+telefone;
		return cadastroCliente;
	}
	void processarCompra(double cart)
	{
		System.out.println("digite o valor da compra..");
		valorCarrinho=ler.nextDouble();
		System.out.println("digite seu saldo na carteira ..");
		carteira=ler.nextDouble();
		if (carteira<valorCarrinho)
		{
			System.out.println("Saldo Insuficiente");
		}
		else
		{
			double carteiraN=carteira-valorCarrinho;
			this.carteira = carteiraN;
			System.out.println("seu saldo atual é "+carteira);
		}
		
		
	}
}
