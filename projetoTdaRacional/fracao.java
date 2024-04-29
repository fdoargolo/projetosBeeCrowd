package projetoTdaRacional;

public class fracao {

	public int numerador;
	public int denominador;

	

	public static void simplificado(int numerador, int denominador) {

		int n = numerador;
		int d = denominador;
		int resto = 0;

		do {
			if (d > 0) {
				resto = n % d;
			}
			n = d;
			d = resto;
		} while (resto != 0);

		System.out.println(numerador + "/" + denominador + " = " + numerador / n + "/" + denominador / n);
	}

	public static void operacoes(String operacao, fracao n1, fracao n2) {
		// TODO Auto-generated method stub
		int numeradorFinal = 0;
		int denominadorFinal = 0;

		if (operacao.equals("+")) {
			numeradorFinal = (n1.numerador * n2.denominador + n2.numerador * n1.denominador);
			denominadorFinal = (n1.denominador * n2.denominador);
		} else if (operacao.equals("-")) {
			numeradorFinal = (n1.numerador * n2.denominador - n2.numerador * n1.denominador);
			denominadorFinal = (n1.denominador * n2.denominador);
		} else if (operacao.equals("*")) {
			numeradorFinal = (n1.numerador * n2.numerador);
			denominadorFinal = (n1.denominador * n2.denominador);
		} else if (operacao.equals("/")) {
			numeradorFinal = (n1.numerador * n2.denominador);
			denominadorFinal = (n2.numerador * n1.denominador);
		}
		
		simplificado((int) numeradorFinal, (int) denominadorFinal);

	}

}
