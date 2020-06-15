package modulo2;

import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
	String resposta;
	Scanner entrada = new Scanner(System.in);
	do {
		System.out.println("Qual é seu nome? Digite 'sair' para sair");
		resposta = entrada.nextLine();
	} while(!resposta.equalsIgnoreCase("sair"));
	entrada.close();
	}
}