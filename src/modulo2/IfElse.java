package modulo2;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Digite um n�mero");
		double numero = Double.parseDouble(valor);
		
		if (numero % 2 == 0) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Numero Impar");
		}
		
	}

}
