public class Numero {
	public static void main(String[] args) {
		new Numero().executar();
	}
	
	public void executar() {
		System.out.println((byte)128); /* printa = -128 */
		System.out.println((byte)130); /* printa = -126, ele começa a regredir o numero */
	}
}


// byte //
// 128 64 32 16 8 4 2 1 //
//   1  0  0  0 0 0 0 0 // quando chega no 128, fica negativo...