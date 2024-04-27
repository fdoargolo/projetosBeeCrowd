package projetoIdade;

import java.util.Scanner;

public class conversaoIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int tempo = sc.nextInt();
		int anos = 0, meses = 0, dias = 0;

		if (tempo >= 365) {
			anos = tempo / 365;
			tempo -= (anos * 365);
		}
		if (tempo >= 30) {
			meses = tempo / 30;
			tempo -= (meses * 30);
		}

		dias = tempo;

		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");

		sc.close();
	}

}
