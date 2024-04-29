package projetoTdaRacional;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numeroDeOperacoes = sc.nextInt();
		
		for(int i = 0; i<numeroDeOperacoes; i++) {
			fracao fracao1 = new fracao();
			fracao1.numerador = sc.nextInt();
			sc.next();
			fracao1.denominador = sc.nextInt();
			String operacao = sc.next();
			fracao fracao2 = new fracao();
			fracao2.numerador = sc.nextInt();
			sc.next();
			fracao2.denominador = sc.nextInt();
				
			fracao.operacoes(operacao,fracao1,fracao2);
			
		}

		sc.close();
	}

}
