package treinamento;

import java.util.Scanner;

public class TipoStringTreinamento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual é seu nome?");
		String nome = entrada.nextLine();
		System.out.println("Qual é o seu sobrenome?");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("Seja bem vindo %s %s\n",nome,sobrenome );	
		
		System.out.println("Quantos anos você tem?");
		int idade = entrada.nextInt();
		
		System.out.println("Ta velho!! Você está com " + idade + " anos?");
		entrada.close();

	}

}
