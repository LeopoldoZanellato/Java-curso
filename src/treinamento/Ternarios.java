package treinamento;

public class Ternarios {
	public static void main(String[] args) {
		double media = 4.9;
		
		String resultadoParcial = media >= 7 ? "Aprovado" : media >= 5 ? "Recupera��o" : "Reprovado";
		
		System.out.println(resultadoParcial);
	}

}
