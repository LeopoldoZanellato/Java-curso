package treinamento;


public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1.0;
		double resultado = a + 2.5;
		System.out.println(resultado);
		
		
		float b = 1.5F;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
		
	}
}
