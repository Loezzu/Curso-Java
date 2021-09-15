package controle;

import java.util.Scanner;

public class Ex02 {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Informe o ano: ");
    int ano = ler.nextInt();

    if (ano % 4 == 00 && ano % 100 != 00 || ano % 4 == 00 &&ano % 100 == 00 && ano % 400 == 00 ) {
      System.out.printf("O ano %d é Bissexto", ano);
    } else {
      System.out.printf("O ano %d não é Bissexto", ano);
    }
    
    ler.close();
  }
}
