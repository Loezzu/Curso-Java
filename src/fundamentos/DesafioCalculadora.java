package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero 1: ");
		double numero1 = ler.nextDouble();
		
		System.out.println("Digite o numero 2: ");
		double numero2 = ler.nextDouble();
		
		System.out.println("Digite o simbolo da operação: ");
		String simbolo = ler.next();

		double resultado = "+".equals(simbolo) ? numero1 + numero2 : 0;
		resultado = "-".equals(simbolo) ? numero1 - numero2 : resultado;
		resultado = "*".equals(simbolo) ? numero1 * numero2 : resultado;
		resultado = "/".equals(simbolo) ? numero1 / numero2 : resultado;
		resultado = "%".equals(simbolo) ? numero1 % numero2 : resultado;
		
		
		System.out.printf("O resultado %.2f %s %.2f é: %.2f",
				numero1, simbolo, numero2, resultado);
		
		ler.close();		
	}
}
