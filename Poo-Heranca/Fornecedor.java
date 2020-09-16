package heranca;

public class Fornecedor extends Pessoa{
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String cpf, int telefone, int idade, double valorCredito,
	double valorDivida) 
	{
		super(nome, endereco, cpf, telefone, idade);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public void imprimirInfo (){
	    System.out.println("\nNome do fornecedor: "+getNome()+"\n"+"Cpf: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endereço: "+getEndereco()+"\nValor crédito: "+valorCredito+"\nValor dívida: "+valorDivida);
	}
	
	public void validarCpf() 
	{
		if (getCpf().length()!=11) {
			System.out.println("--Cpf inválido!!");
		}else {
			System.out.println("--Cpf válido!");
		}
				
	}

	public void obterSaldo() {
		double diferencacd= valorCredito-valorDivida;
		System.out.println("O saldo referente ao fornecedor é igual a: "+diferencacd);
	}
	
		
	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}	
}
