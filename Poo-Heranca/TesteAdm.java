package heranca;

public class TesteAdm {
	public static void main (String args[])
	{
		Administrador Bruno= new Administrador ("Bruno ", "rua do z� n�40","00200100547",25544114,27,500,2000);
		Bruno.imprimirInfo();
		Bruno.calcularSalario();
		Bruno.imprimir();
	}
}
