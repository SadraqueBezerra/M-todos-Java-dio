package br.dio.quadrilatero;

public class Quadrilatero {

	public static void main(String[] args) {

		System.out.println("Exercício Quadrilátero \n");

		double areaQuadrado = area(3);
		System.out.println("Área do Quadrado: " + areaQuadrado);

		double areaRetangulo = area(5d, 5d);
		System.out.println("Área do Retangulo: " + areaRetangulo);

		double areaTrapezio = area(7, 8, 9);
		System.out.println("Área do Trapézio: " + areaTrapezio);

		double areaLosango = area(5f, 5f);
		System.out.println("Área do Losango: " + areaLosango);

	}

	public static double area(double lado) {

		return lado * lado;

	}

	public static double area(double lado1, double lado2) {

		return lado1 * lado2;

	}

	public static double area(double baseMaior, double baseMenor, double altura) {

		return ((baseMaior + baseMenor) * altura) / 2;

	}

	public static float area(float diagonal1, float diagonal2) {

		return (diagonal1 * diagonal2) / 2;

	}

}
