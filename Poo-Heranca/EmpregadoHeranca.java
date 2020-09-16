package heranca;

public class EmpregadoHeranca extends Pessoa{
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public EmpregadoHeranca(String nome, String endereco, String cpf, int telefone, int idade, int codigoSetor,
			float salarioBase, float imposto) {
		super(nome, endereco, cpf, telefone, idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public void imprimirInfo (){
	    System.out.println("\nNome do empregado: "+getNome()+"\n"+"Cpf: "+getCpf()+"\n"+"Idade: "+getIdade()+"\n"+"Telefone: "+getTelefone()+"\n"+"Endere�o: "+getEndereco()+"\nC�digo setor: "+codigoSetor+"\nSal�rio base: "+salarioBase+"\nValor em porcentagem (sem o '%') de imposto a ser retido do sal�rio: "+imposto);
	}
	
	public void calcularSalario() {
		double salario_total = salarioBase - (salarioBase*(imposto/100));
		System.out.println("O sal�rio total a ser recebido pelo empregado "+getNome()+" � igual a: "+salario_total);
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoStor) {
		this.codigoSetor = codigoStor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
}
