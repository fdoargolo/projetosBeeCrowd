package projetoMonetario;

import java.util.Scanner;

public class conversaoValorDinheiro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int valorTotalCentavos = (int) (sc.nextDouble() * 100);
		sc.close();

		int[] valoresCentavos = { 10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1 };
		String[] valorEmReal = { "100.00", "50.00", "20.00", "10.00", "5.00", "2.00", "1.00", "0.50", "0.25", "0.10",
				"0.05", "0.01" };

		for (int i = 0; i < valoresCentavos.length; i++) {

			int quantidade = valorTotalCentavos / valoresCentavos[i];
			valorTotalCentavos %= valoresCentavos[i];

			if (i == 0) {
				System.out.println("NOTAS:");
			} else if (i == 6) {
				System.out.println("MOEDAS:");
			}
			result(quantidade, valorEmReal[i]);

		}
	}

	public static void result(double quantidade, String nota) {
		double notaDouble = Double.parseDouble(nota);
		if (notaDouble > 1) {
			System.out.printf("%.0f nota(s) de R$ %s\n", quantidade, nota);
		} else {
			System.out.printf("%.0f moeda(s) de R$ %s\n", quantidade, nota);
		}
	}
}
