package fundamentos;

import java.util.Scanner;


public class DesafioConversao {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro salario:");
		String salario1 =  entrada.next().replace(",", ".");
		
		System.out.println("Digite seu segundo salario:");
		String salario2 =  entrada.next().replace(",", ".");
		
		System.out.println("Digite seu terceiro salario:");
		String salario3 =  entrada.next().replace(",", ".");
		
		double primeiroSalario = Double.parseDouble(salario1);
		double segundoSalario = Double.parseDouble(salario2);
		double terceiroSalario = Double.parseDouble(salario3);
		
		double media = (primeiroSalario + segundoSalario + terceiroSalario) / 3;
		
		System.out.println(media);
		
		entrada.close();
	}
}
