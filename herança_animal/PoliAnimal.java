package heranca;
//Atributos
public class PoliAnimal {
	private String Nome;
	private int Idade;
	private String Som;
	private String Tipo;
	private String movimento;
	
	//Construtor
	public PoliAnimal()
	{
		
	}// Metodo 
	public String infoAnimal()
	{
		return "O Animal é um "+getTipo()+" O nome dele é: "+getNome()+" Sua idade é "+getIdade()+" ano(s) "+this.getSom()+" e esta :"+this.movimento;
		
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getSom() {
		return Som;
	}
	public void setSom(final String som) {
		Som = som;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	
	}
	public String getMovimento() {
		return movimento;
	}
	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	
}
