package modulo2;

import java.util.Scanner;

public class CondicaoIF {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a sua m�dia");
		double media = entrada.nextDouble();
		
		if (media > 10 || media <0) {
			System.out.println("Nota inv�lida, deve ser menor que 10");
		}
		
		if (media <=10 && media >=7) {
			System.out.println("Parab�ns!! Voc� esta aprovado");
		}
		
		if (media<7 && media >=5) {
			System.out.println("Recupera��o");
		}
		
		if (media < 5 && media >=0) {
			System.out.println("Reprovado");
		}
		
		
		entrada.close();
	
	
	
	}
}
