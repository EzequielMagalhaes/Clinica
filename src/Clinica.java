public class Clinica {
	public static void main(String[] args) { /* metodo main é a porta de entrada. */
		
		/*String x = "Oi";//metodo 1 de declarar uma string
		String y = new String("Oi");//metodo 2
		System.out.println();*/
		
		System.out.println("1.Entrei no main");
		Clinica clinica = new Clinica();
		/* new Clinica().testar(); // objeto anônimo */
		clinica.testar();
		System.out.println("9.Final do programa");
	}
	
	public void testar() {
		System.out.println("2.Entrei no testar");
		Cao toto = new Cao();
		toto.obterDono();
		System.out.println("8.Sair do testar");
	}
}