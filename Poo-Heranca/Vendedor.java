package heranca;

import java.text.NumberFormat;

/*Implemente a classe Vendedor como subclasse da classe Pessoa. 
 * Um determinado vendedor tem como atributos da classe Pessoa
 *  e também os atributos próprios como valorVendas (correspondente ao valor monetário dos artigos vendidos)
 *   e o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor)*/
public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	private double valor_total;
	
	public Vendedor(String nome, String endereco, String cpf, int telefone, int idade, double valorVendas)
	{
		super(nome, endereco, cpf, telefone, idade);
		this.valorVendas = valorVendas;
		this.comissao= comissao;
		this.valor_total= valor_total;
		
	}
	
	public void imprimir()
	{
		System.out.println("O vendedor "+getNome()+" teve um total de "+this.formatarMoeda()+" em vendas e ganhou uma comissão de "+this.formatarMoeda1());
	}
	public void imprimirInfo ()
	{
		valor_total = valorVendas;
		comissao = (valor_total*20)/100;
	    System.out.println("\nNome do vendedor: "+getNome()+"\n"+"Cpf: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+"\n"+"O valor da venda foi de : "
	+this.formatarMoeda()+"\n"+"O valor da comissão foi de: "+this.formatarMoeda1());
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getValor_total() {
		return valor_total;
	}
	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valorVendas);
		return formatoMoeda;
	}
	public String formatarMoeda1()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(comissao);
		return formatoMoeda;
	}
	
}
