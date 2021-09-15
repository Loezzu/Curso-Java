package controle;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		
		Scanner ler  = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = ler.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = ler.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if(media < 7.0 && media > 4.0){
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		ler.close();
	}
}
