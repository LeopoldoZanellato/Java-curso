package modulo2;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		String conceito = "";
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite a sua nota");
		int nota = entrada.nextInt();
		
		
		switch(nota) {
		case 10: case 9: case 8:
			conceito = "A";
			break;
		case 7: case 6: case 5:
			conceito = "B";
			break;
		case 4: case 3: case 2: case 1: case 0:
			conceito = "C";
			break;
		
		default:
			conceito = "Não Informado";
		}
		
		
		System.out.println("Conceito " + conceito);
		entrada.close();
	}

}
