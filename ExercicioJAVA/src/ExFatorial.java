public class ExFatorial {

	public static void main(String[] args) {
		int fat = 1;
		int num1 = Integer.parseInt(args[0]);

		for (int i = 1; i <= num1; i++) {
			fat *= i;
		}
		System.out.println("O fatorial de " + num1 + " é igual a " + fat);
	}

}
