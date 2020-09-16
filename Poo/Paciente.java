package aprendendoPoo;

public class Paciente {
	public static void main (String args[])
	{
		PooPaciente paciente1 = new PooPaciente();
		paciente1.nome="Gabriel";
		paciente1.idade="18";
		paciente1.registro="0071";
		paciente1.sintoma="febre";
		paciente1.ultimaConsulta="18/04/2017";
		
		paciente1.entradaPaciente();
		
		System.out.println("O paciente "+paciente1.nome+" de "+paciente1.idade+" ano(s) com o N° registro "+paciente1.registro+" com sintoma "+paciente1.sintoma+" data da ultima consulta "+ paciente1.ultimaConsulta);
		
		paciente1.triagemPaciente(0);

	}
}
