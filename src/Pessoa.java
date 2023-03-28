public abstract class Pessoa {
	
	private String nome;
			
	public Pessoa (String nome) {
		System.out.println("4.Construtor de pessoa");
		this.nome = nome;
	}
	
	public final void Show() {
		System.out.println("Oi estou em pessoa");
	}
	
	private String getNomeFalso() {
		return "João da Silva";
	}
	
	public String getNome() {
		System.out.println("7.Peguei o nome do Dono");
		return nome;
	}
}