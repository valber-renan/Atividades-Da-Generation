package heranca;

/*Implemente a classe Administrador como subclasse da classe pessoa.
 *  Um determinado administrador tem como atributos da classe Pessoa e também os atributos
próprios como ajudaDeCusto (ajudas referentes a viagens, estadias)*/
import java.text.NumberFormat;

public class Administrador extends Pessoa{

	
	private double ajudaDeCusto;
	private double salario;
	public Administrador(String nome, String endereco, String cpf, int telefone, int idade,double ajudaDeCusto, double salario)
	{
		super(nome, endereco, cpf, telefone, idade);
		this.salario= salario;
		this.ajudaDeCusto=ajudaDeCusto;
	}
	public void imprimirInfo ()
	{
	    System.out.println("\nNome do Administrador: "+getNome()+"\n"+"Cpf: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+"\n"+"O valor da Ajuda de custo foi de :"+this.formatarMoeda2()+"\n"+"O valor do salario foi de :"+this.formatarMoeda());
	}

	public void calcularSalario()
	{
		if (ajudaDeCusto>0)
		{
			salario= salario+ajudaDeCusto;
		}
		else
		{
			System.out.println("o total a receber foi "+salario);
		}
	}
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	public String formatarMoeda2()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(ajudaDeCusto);
		return formatoMoeda;
	}
	public void imprimir()
	{
		System.out.println("O administrador "+getNome() + "receberá um salario de: "+this.formatarMoeda());
	}
	
}
