package treinamento;


public class Circunfer�ncia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		double area = PI * raio * raio; // nome de constante sempre em letra mai�scula
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println("�rea = " + area);
	}

}
