package treinamento;

public class Temperatura {
	/*
	 Fº e Cº tem que ser uma variável
	 32 ajuste
	 5/9 fator
	 */
	// (Fº - 32) X 5/9 = ºC
	public static void main(String[] args) {
		final double FATOR = 5/9.0;
		final int AJUSTE = 32;
		double f = 86;
		double c = (f - AJUSTE) * FATOR;
		
		System.out.println(c);
	}

}
