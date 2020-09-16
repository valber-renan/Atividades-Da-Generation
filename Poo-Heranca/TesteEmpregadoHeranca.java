package heranca;

public class TesteEmpregadoHeranca {
	public static void main(String args[]) {
		
		EmpregadoHeranca nina = new EmpregadoHeranca("Nina","Rua marola, nº99","52052052050",948484848,26,322, 1500,15);
	
		nina.imprimirInfo();
		nina.calcularSalario();
	}
}
