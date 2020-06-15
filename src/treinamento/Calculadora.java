package treinamento;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		// entrada de dados
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero");
		double num1 = entrada.nextDouble();
		System.out.println("Digite o segundo n�mero");
		double num2 = entrada.nextDouble();
		
		// definica��o do operador
		
		System.out.println("Digite o operador: + - / *");
		String operador = entrada.next();
		
		System.out.println(operador);
		
		//String resultado = operador.equals("+")? "teste": "testando";
		
		double resultado = operador.equals("+") ? (num1 + num2) :
						   operador.equals("-") ? (num1 - num2):
						   operador.equals("*") ? (num1 * num2):
						   operador.equals("/") ? (num1 / num2): 0;
						   		
		System.out.println(resultado);
		
		entrada.close();
	}
}
