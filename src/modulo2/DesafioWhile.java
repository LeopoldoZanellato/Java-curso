package modulo2;

import java.util.Scanner;

public class DesafioWhile {
//	Calcular a m�dia de nota da turma, sem saber quantos alunos a sala tem
//	o usuario vai digitar uma nota v�lida de 0 a 10, e no final tenho que saber qual � a m�dia...
//	-1 sai do programa...
//	nota tem que ser v�lida
//	
	public static void main(String[] args) {

		// defini��o de variaveis
		int numeroAlunos = 0;
		double soma = 0;
		double valor = 0;
		double media = 0;
		
		Scanner entrada = new Scanner(System.in);

		// entrada de valores
		do {
			System.out.println("Digite uma nota ou '-1' para sair");
			valor = entrada.nextDouble();

			if (valor == -1) {
				break;
			}

			else if (valor < 0 || valor > 10) {
				System.out.println("Nota invalida");
			}

			else {
				soma = soma + valor;
				numeroAlunos++;
			}

		} while (valor != -1);
		
		media = soma / numeroAlunos;
		
		entrada.close();
		System.out.println("N�mero de alunos: " + numeroAlunos);
		System.out.println("Soma: " + soma);
		System.out.println("A nota m�dia foi: " + media);
	}

}
