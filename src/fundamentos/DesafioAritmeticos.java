package fundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
	
		double conta1 = Math.pow(6 * (3 + 2), 2) / (3 * 2);
		
		double conta2 = Math.pow((1 - 5) * (2 - 7) / 2, 2);
		
		int contaFinal = (int) Math.pow(conta1 - conta2, 3) / (int) Math.pow(10, 3);
		
		System.out.println("O resultado é: " + contaFinal);
		
		
	}
}
