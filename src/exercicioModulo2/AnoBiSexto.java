package exercicioModulo2;

import javax.swing.JOptionPane;

//2. Criar um programa informa se o ano atual é um ano bissexto;
// Anos bisextos são divisiveis por 400 mas não por 100

public class AnoBiSexto {
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Digite um número");
		
		int ano = Integer.parseInt(valor);

		
		if (ano % 4 == 0 && ano % 100 !=0) {
		System.out.println("é um ano bisexto");
		} else
			
			System.out.println("não é um ano bissexto");
		
	}

}
