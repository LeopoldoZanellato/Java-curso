package treinamento;

import java.util.Scanner;

public class TipoStringTreinamento {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual � seu nome?");
		String nome = entrada.nextLine();
		System.out.println("Qual � o seu sobrenome?");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("Seja bem vindo %s %s\n",nome,sobrenome );	
		
		System.out.println("Quantos anos voc� tem?");
		int idade = entrada.nextInt();
		
		System.out.println("Ta velho!! Voc� est� com " + idade + " anos?");
		entrada.close();

	}

}
