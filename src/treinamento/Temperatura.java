package treinamento;

public class Temperatura {
	/*
	 F� e C� tem que ser uma vari�vel
	 32 ajuste
	 5/9 fator
	 */
	// (F� - 32) X 5/9 = �C
	public static void main(String[] args) {
		final double FATOR = 5/9.0;
		final int AJUSTE = 32;
		double f = 86;
		double c = (f - AJUSTE) * FATOR;
		
		System.out.println(c);
	}

}
