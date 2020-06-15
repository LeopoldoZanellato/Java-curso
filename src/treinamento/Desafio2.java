package treinamento;

public class Desafio2 {
	public static void main(String[] args) {
		// expressão 1
		double mult = 6 * (3 + 2);
		double exp = Math.pow(mult, 2);
		double expressao1 = exp / (3 * 2);
		
		// expressão 2
		double mult1 = ((1-5) * (2-7)) / 2;
		double expressao2 = Math.pow(mult1, 2);
		
		// expressão 3
		double sub = expressao1 - expressao2;
		double expressao3 = Math.pow(sub,3);
		
		// expressao 4
		double divisor = Math.pow(10, 3);
		
		// expressao final
		
		double expressaofinal = expressao3 / divisor;
		
		System.out.println(expressaofinal);
	}
}
