package controle;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o numero: ");
		int numero = ler.nextInt();
		
		if (numero % 2 == 1 || numero == 2) {
			System.out.println("� um numero Primo!");
		} else {
			System.out.println("numero informado n�o � um numero primo");
		}
		
		ler.close();
	}
}
