package treinamento;

public class Ternarios {
	public static void main(String[] args) {
		double media = 4.9;
		
		String resultadoParcial = media >= 7 ? "Aprovado" : media >= 5 ? "Recuperação" : "Reprovado";
		
		System.out.println(resultadoParcial);
	}

}
