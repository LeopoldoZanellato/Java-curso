package treinamento;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu 1� salario");
		String salario1 = entrada.nextLine().replace(",",".");
		
		System.out.println("Digite o seu 2� salario");		
		String salario2 = entrada.nextLine().replace(",",".");	
		
		System.out.println("Digite o seu 3� salario");
		String salario3 = entrada.nextLine().replace(",",".");
		
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);		
		double valor3 = Double.parseDouble(salario3);
	
		double media = (valor1 + valor2 + valor3) / 3;			
				
		System.out.println("O seu valor salarial m�dio dos ultimos 3 meses �: " + media);
		entrada.close();
	}
}
