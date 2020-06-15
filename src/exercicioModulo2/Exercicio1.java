package exercicioModulo2;

import java.util.Scanner;

//1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número entre 0 e 10");
		int numero = entrada.nextInt();
		
		
		if (numero >= 0 && numero <=10) {
		System.out.println("Número está entre 0 e 10");
			if (numero % 2 ==0) {
				System.out.println("Número é par");
			} else
				System.out.println("Número é impar");
		} else {
		System.out.println("Número inválido, digite um número entre 0 e 10");
		}
		entrada.close();
	}

}
