package br.dio.quadrilatero;

public class Quadrilatero {
	
	public static void main(String[] args) {
		
		System.out.println("Exerc�cio Quadril�tero \n");
		
		area(3);
		area(5d, 5d);
		area(7, 8, 9);
		area(5f, 5f);
		
	}
	
	public static void area(double lado) {
		
		System.out.println("�rea do Quadrado: " + lado * lado);
		
	}
	
	public static void area(double lado1, double lado2) {
		
		System.out.println("�rea do Ret�ngulo: " + lado1 * lado2);
		
	}
	
	public static void area(double baseMaior, double baseMenor, double altura) {
		
		System.out.println("�rea do Trap�zio: " + ((baseMaior+baseMenor)*altura) / 2);
		
	}
	
	public static void area(float diagonal1, float diagonal2) {
		
		System.out.println("�rea do Losango: " + (diagonal1 * diagonal2) / 2);
		
	}

}

