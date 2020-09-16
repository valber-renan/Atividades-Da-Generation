package aprendendoPoo;

public class Cliente {
	public static void main (String args[])
	{
		PooCliente cliente1 = new PooCliente ("Rogerio ceni ","00000000000","R das laranjas 145","(11)9999-6555");
		System.out.println(cliente1.getInfoCliente());
		cliente1.processarCompra(0);
		System.out.println();
		PooCliente cliente2 = new PooCliente ("Ronaldinho ","00000000000","R das laranjas 185","(11)9999-7555");
		System.out.println(cliente2.getInfoCliente());
		cliente2.processarCompra(0);
		
	}
}
