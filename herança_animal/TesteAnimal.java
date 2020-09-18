package heranca;

public class TesteAnimal {
	public static void main (String args[])
	{
		PoliCavalo spirit= new PoliCavalo();
		spirit.setNome("marrom");
		spirit.setIdade(5);
		spirit.setSom("irghrrrra");
		spirit.setTipo("cavalo");
		spirit.setMovimento("correndo");
		
		PoliCachorro rex= new PoliCachorro();
		rex.setNome("rex");
		rex.setIdade(8);
		rex.setSom("au au ");
		rex.setTipo("cachorro");
		rex.setMovimento("correndo");
		
		PoliPreguica maisTarde= new PoliPreguica();
		maisTarde.setNome("maisTarde");
		maisTarde.setIdade(7);
		maisTarde.setSom("tic");
		maisTarde.setTipo("preguiça");
		maisTarde.setMovimento("subindo em arvores");
		
		PoliCavalo spic= new PoliCavalo();
		spic.setNome("pé de pano");
		spic.setIdade(9);
		spic.setSom("irghrrrra");
		spic.setTipo("cavalo");
		spic.setMovimento("trotando");
		
		
		PoliAnimal[]animais=new PoliAnimal[4];
		animais[0]= spirit;
		animais[1]= rex;
		animais[2]=maisTarde;
		animais[3]=spic;
		
		for (PoliAnimal animal: animais )
		{
			System.out.println(animal.infoAnimal());
		}
	
	}
	
}
