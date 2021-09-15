package controle;

import java.util.Scanner;

public class ex01 {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Informe o numero de 0 a 10: ");
    int numero = ler.nextInt();

    if(numero >=0 && numero <=10 && numero % 2 == 0) {
      System.out.printf("o numero %d é par", numero);
    } else if (numero % 2 == 1){
      System.out.printf("o numero %d não é par", numero);
    } else {
      System.out.println("numero inválido");
    }

  }
}
