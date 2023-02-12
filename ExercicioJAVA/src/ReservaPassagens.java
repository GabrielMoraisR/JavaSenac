import java.util.Random;
import java.util.Scanner;

public class ReservaPassagens {

	static final int FILEIRAS = 28;
	static final int ASSENTOS = 6;
	static boolean[][] assentos = new boolean[FILEIRAS][ASSENTOS];

	public static void main(String[] args) {
		inicializaAssentos();
		assentosOcupados();

		Scanner sc = new Scanner(System.in);
		boolean continuaReservando = true;

		while (continuaReservando) {
			System.out.print("Digite a fileira desejada: ");
			int fileira = sc.nextInt();

			System.out.print("Digite o assento desejado: ");
			int assento = sc.nextInt();

			if (assentos[fileira][assento]) {
				System.out.println("Assento já ocupado, por favor escolha outro.");
			} else {
				assentos[fileira][assento] = true;
				System.out.println("Assento reservado com sucesso!");
			}

			System.out.print("Deseja reservar mais um assento? (s/n) ");
			continuaReservando = sc.next().equalsIgnoreCase("s");
		}

		sc.close();
		System.out.println("finalizada.");
	}

	private static void inicializaAssentos() {
		Random rand = new Random();

		for (int i = 1; i < FILEIRAS; i++) {
			for (int j = 1; j < ASSENTOS; j++) {
				assentos[i][j] = rand.nextBoolean();
			}
		}
	}

	private static void assentosOcupados() {
		System.out.println("Assentos ocupados:");

		for (int i = 1; i < FILEIRAS; i++) {
			for (int j = 1; j < ASSENTOS; j++) {
				if (assentos[i][j]) {
					System.out.println("Fileira " + i + ", assento " + j);
				}
			}
		}
	}
}