package exercicioModulo2;

import java.util.Scanner;

public class Exercicio3 {
//	3. Criar um programa que receba duas notas parciais, calcular a meedia final. 
//	Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
//	se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperaccaoo", caso contrario imprime no console "Reprovado"
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double media = 0;
		double nota1 = -1;
		double nota2 = -1;
		
		
		while (nota1 < 0 || nota1 >10 ) {
		System.out.println("Digite o valor da primeira nota");
		nota1 = entrada.nextDouble();
			if (nota1 < 0 || nota1 >10 ) {
				System.out.println("Digite uma nota v�lida");
			}
		}
	
		while (nota2 < 0 || nota2 >10 ) {
		System.out.println("Digite o valor da segunda nota");
		nota2 = entrada.nextDouble();
			if (nota2 < 0 || nota2 >10 ) {
				System.out.println("Digite uma nota v�lida");
			}
		}
		
		media = (nota1 + nota2) / 2;
		
		if (media > 7) {
			System.out.printf("Aprovado com m�dia %.2f", media);
		} else if (media > 4 && media <7 ) {
			System.out.println("Recupera��o");
		} else {
			System.out.println("Reprovado");
		}
		
		entrada.close();
		
		
	}

}
