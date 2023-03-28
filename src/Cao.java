public class Cao {
	Pessoa dono;
	
	public Cao() {
		System.out.println("3.Construtor de cão");
		dono = new Dono();
	}
	
	public void obterDono() {
		System.out.println("6.Entrei no obterDono");
		System.out.println(dono.getNome());
	}
}