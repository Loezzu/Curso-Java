package controle;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int aleatorio = 12;
		
		if (aleatorio >= 0 && aleatorio <= 100) {
			for(int tentativa = 1; tentativa <= 10; tentativa++) {
				System.out.println("Informe um numero: ");
				int numero = ler.nextInt();
				
				int restantes = 10 - tentativa;
				
				if(numero == aleatorio) {
					System.out.println("Parabens, voce acertou!!");
					break;
				} else if(numero > aleatorio) {
					System.out.println("Numero informado é maior que o numero armazenado");
				} else if(numero < aleatorio) {
					System.out.println("Numero informado é menor que o numero armazenado");
				}
				System.out.println("Tentativas restantes: " + restantes);
			}
		}
		
		ler.close();
		
	}
}
