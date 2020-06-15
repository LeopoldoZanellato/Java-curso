package modulo2;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Entrada na tela
		System.out.println("Digite o dia da semana");
		String diaDaSemana = entrada.nextLine();
		diaDaSemana = diaDaSemana.toLowerCase();
		diaDaSemana = diaDaSemana.replace("-", " ");
		diaDaSemana = diaDaSemana.replace("ç", "c");
		diaDaSemana = diaDaSemana.replace("á", "a");
		
		//começo das condicionais
		if ("domingo".equals(diaDaSemana)) {
			System.out.println("0");
		} else if ("segunda".equals(diaDaSemana) || "segunda feira".equals(diaDaSemana)) {
			System.out.println("2");
		} else if ("terca".equals(diaDaSemana) || "terca feira".equals(diaDaSemana)) {
			System.out.println("3");
		} else if ("quarta".equals(diaDaSemana) || "quarta feira".equals(diaDaSemana)) {
			System.out.println("4");
		} else if ("quinta".equals(diaDaSemana) || "quinta feira".equals(diaDaSemana)) {
			System.out.println("5");
		} else if ("sexta".equals(diaDaSemana)|| "sexta feira".equals(diaDaSemana)) {
			System.out.println("6");
		} else if ("sabado".equals(diaDaSemana)) {
			System.out.println("7");
		} else {
			System.out.println("Dia inváldo");
		}
		
		
		
		// System.err.println(diaDaSemana);
		
		entrada.close();
		
	}

}
