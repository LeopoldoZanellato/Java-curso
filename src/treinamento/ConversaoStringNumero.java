package treinamento;

import javax.swing.JOptionPane;


public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro numero");
		
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo valor");
		
		
		
		System.out.println(valor1 + valor2);
		System.out.println(valor2);		
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2 + valor1);
		System.out.println(numero1);
		System.out.println(numero2);
	}
}
