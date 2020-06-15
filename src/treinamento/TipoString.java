package treinamento;

import java.util.Scanner;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Bom Dia".charAt(0));
		String s = "Bom dia!!";
		String a = "Muito legal";
		String nome = "Leopoldo";
		final int idade = 18;
		double salario = 18756.56;
		
		
		System.out.println(s.concat("!!!"));
		System.out.println(s.toLowerCase().startsWith("bom "));
		
		
		// %s substitui strings, %d substitui inteiros, %f substitui double/float
		// %.2f --> arredonda duas casas decimais
		
		System.out.printf("%s %s Muito legal!!! %s Ele tem %d anos e ganha R$%.2f \n",s,nome,a, idade, salario);
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("Digite o seu nome:");
		String nomeInput = entrada.nextLine();
		
		System.out.printf("Digite o seu sobre nome:");
		String sobrenomeInput = entrada.nextLine();
		
		System.out.printf("Digite a sua idade:");
		int idadeInput = entrada.nextInt();
		
		// Next Int eu uso para pegar inteiros, next Line uso para pegar strings
		
		System.out.printf("Seu nome é: %s %s", nomeInput, sobrenomeInput);
		System.out.printf("\nSua idade é: %s", idadeInput);
		
		
		entrada.close();
		// Scanner é necessario ter o close
		
	}
}
