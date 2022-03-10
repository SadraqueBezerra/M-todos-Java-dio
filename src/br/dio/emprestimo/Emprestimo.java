package br.dio.emprestimo;

public class Emprestimo {

	public static void main(String[] args) {

		System.out.println("Exerc�cio Empr�stimo \n");

		calcular(1000, Emprestimo.getDuasParcelas());
		calcular(1000, Emprestimo.getTresParcelas());
		calcular(1000, 5);
	}

	public static int getDuasParcelas() {

		return 2;

	}

	public static int getTresParcelas() {

		return 3;

	}

	public static double getTaxaDuasParcelas() {

		return 0.3;

	}

	public static double getTaxaTresParcelas() {

		return 0.45;

	}

	public static void calcular(double valor, int parcelas) {

		double valorFinal;

		if (parcelas == 2) {

			valorFinal = valor + (valor * getTaxaDuasParcelas());

			System.out.println("Valor final do empr�stimo para 2 parcelas: R$ " + valorFinal);

		} else if (parcelas == 3) {

			valorFinal = valor + (valor * getTaxaTresParcelas());

			System.out.println("Valor final do empr�stimo para 3 parcelas: R$ " + valorFinal);

		} else {

			System.out.println("Quantidade de parcelas n�o aceita");

		}
	}
}
