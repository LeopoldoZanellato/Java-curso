package modulo2;

import java.util.Scanner;

public class ElseIF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor = entrada.nextDouble();
		
		if (valor > 10 || valor < 0) {
			System.out.println("Nota inv�lida");
		} else if (valor > 8.1){
			System.out.println("Parab�ns nota m�xima");
			
		}
		
		
		
		
		entrada.close();
	}

}
