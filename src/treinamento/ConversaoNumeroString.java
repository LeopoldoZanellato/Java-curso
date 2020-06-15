package treinamento;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		//primeira forma de transformação
		Integer num1 = 10000;
		System.out.println(num1.toString());
		System.out.println(num1.toString().length());
				
		//Segunda forma de transformação
		int num2 = 10000;
		System.out.println(Integer.toString(num2));
		
	}
}
