package modulo2;

import java.util.Scanner;

public class CondicaoIF {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a sua média");
		double media = entrada.nextDouble();
		
		if (media > 10 || media <0) {
			System.out.println("Nota inválida, deve ser menor que 10");
		}
		
		if (media <=10 && media >=7) {
			System.out.println("Parabéns!! Você esta aprovado");
		}
		
		if (media<7 && media >=5) {
			System.out.println("Recuperação");
		}
		
		if (media < 5 && media >=0) {
			System.out.println("Reprovado");
		}
		
		
		entrada.close();
	
	
	
	}
}
