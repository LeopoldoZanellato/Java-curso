package treinamento;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informa��es do funcionario
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 2146;
		int id = 56789;
		long pontosAcumulados = 3134845223L; //quando for long devo utilizar o L no final para indicar que � long
		
		// Tipos num�ricos reais
		float salario = 11_445.44F; // devo indicar o F para saber que � float
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		boolean estaDeFerias = false; //true
		
		//tipo caractere
		char status = 'A'; // ativo, apenas um char
		
		// utiliza��o das variaveis
		System.out.println("ID: "+id + " ganha: R$" + salario);
		System.out.println("Ele tem " + anosDeEmpresa + " anos de empresa");
		System.out.println("Ele tem " + numeroDeVoos + " v�os e " + pontosAcumulados + " pontos acumulados");
		System.out.println("Vendas acumuladas: " + "R$" + vendasAcumuladas);
		System.out.println("Esta de f�rias? " + estaDeFerias);
		System.out.println("Ativo na empresa? " + status);
		}
}
