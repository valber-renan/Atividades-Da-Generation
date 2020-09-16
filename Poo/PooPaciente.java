package aprendendoPoo;

import java.util.Scanner;

/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class PooPaciente {
	Scanner ler = new Scanner(System.in);
	int diagnostico;
	String nome;
	String idade;
	String sintoma;
	String registro;
	String ultimaConsulta;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getUltimaConsulta() {
		return ultimaConsulta;
	}

	public void setUltimaConsulta(String ultimaConsulta) {
		this.ultimaConsulta = ultimaConsulta;
	}

	void entradaPaciente()
	{
		System.out.println("O paciente deu entrada no hospital");
	}
	void triagemPaciente(int nivel)
	{
		System.out.println("Informe a classificação do paciente");
		diagnostico = ler.nextInt();
		if(diagnostico==1)
		{
			System.out.println("paciente sem necessidade de atendimento urgente");
		}
		else if(diagnostico==2)
		{
			System.out.println("paciente com necessidade de atendimento mediana");
		}
		else if(diagnostico==3)
		{
			System.out.println("paciente com necessidade de atendimento Urgente!!!");
		}
		else
		{
			System.out.println("Opção inválida!!");
		}
	}
	
}
