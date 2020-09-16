package aprendendoPoo;

public class Aviao {
	public static void main (String args[])
	{
		PooAviao aviao1 = new PooAviao();
		aviao1.tamanho = "Jumbo";
		aviao1.marca = "Latam";
		aviao1.cor = "Azul";
		aviao1.velocidadeAtual = 0;
		
		aviao1.mostraClasse(0);
		
		aviao1.decola();
		
		aviao1.acelera(200);
		
		
		System.out.println("O avião de tamanho "+aviao1.tamanho+" da marca "+aviao1.marca+" e da cor "+aviao1.cor+" está a "+aviao1.velocidadeAtual+" KM por hora");
		
		
		
	}
}
