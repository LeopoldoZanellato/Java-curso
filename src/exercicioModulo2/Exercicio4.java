package exercicioModulo2;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = entrada.nextInt();
		int i = 2;
		double modulo;
		int cont = 0;
		
		for (; i < numero; i++) {
			modulo = numero % i;
			System.out.println(modulo);
			entrada.close();
		}
		
//		if (cont == 1) {
//			System.out.println("é um numero primo");
//		} else {
//			System.out.println("Não é um numero primo");
//		}
	}
		

}
