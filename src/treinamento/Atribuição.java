package treinamento;

public class Atribuição {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c=c+b
		c -= a; //c = c-a
		c *= b; //c= c*b
		c /= a; //c = c/a;
		c %=2; // c = c % 2 impar ou par
		
		c++; // c = c + 1
		
		System.out.println(c);
		
		
	}

}
