public class ExSomaDosArgumentos {

	public static void main(String[] args) {

		mostrarQuantidade(args.length);

		mostraParametros(args);

	}

	public static void mostrarQuantidade(int quantidade) {
		System.out.println("Argumento: " + quantidade);
	}

	public static void mostraParametros(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("Argumento " + (i + 1) + ": " + args[i]);
		}
	}
}