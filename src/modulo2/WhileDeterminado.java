package modulo2;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {

//		//while 
//		int contador = 0;
//		while  (contador <4) {
//			System.out.println("Bom dia!!");
//			contador++;
//			
//		}
		
		
		//for �: (int contador, def de variv�vel; express�o, que � a valida��o, incremento) 
		
		
//		
//		for (int contador = 0; contador < 5; contador++) {
//			System.out.println("Bom dia!!");
//		}	
		String resposta = "";
		Scanner entrada = new Scanner(System.in);
		
		while (!resposta.equalsIgnoreCase("sair")) {
			System.out.println("Bom dia, digite sair para sair");
			resposta = entrada.nextLine();
		}
		

		entrada.close();
		
	}
}
