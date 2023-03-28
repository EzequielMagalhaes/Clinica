/*abstract class Estrutura{
	public abstract static void show();
} */


/* se botar final na classe, ela nao pode mais ter filhos. 
 * se botar final no metodo, proibe a classe filho de edita-lo posteriormente.*/	
final class Teste {//extends Estrutura{ 
	private Teste() { }
	public static final void Show() { /* static é capaz de acessar atraves da classe. */
		System.out.println("Show");
	}
}

/* Essa classe fica inutilizada, se continuar usando o 'extends Teste' */
public class Mostra {
	public void Show() {
		System.out.println("Show all");/* modifica o metodo da classe pai, na classe filho. */
	}
	
	public static void main(String[] args) {
		new Mostra().iniciar();
	}
	
	public void iniciar() {
		Teste.Show();
	}
}