package heranca;

public class PoliPreguica extends PoliAnimal{
private String movimento;
	
	public PoliPreguica()
	{
		
	}

	public String infoAnimal()
	{
		return "O Animal � um "+super.getTipo()+" O nome dele �: "+super.getNome()+" Sua idade � "+super.getIdade()+" ano(s) "+this.getSom()+" e esta :"+this.movimento;
		
	}
	public String getMovimento() {
		return movimento;
	}

	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	
	public String getSom()
	{
		return" emite o som "+super.getSom();
	}
}
