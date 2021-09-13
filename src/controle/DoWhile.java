package controle;

import java.util.Scanner;

public class DoWhile {

  public static void main(String[] args) {

    // if(...) sentenca; ou {}
    // while(...) sentenca; ou {}
    // for(...;...;...) sentenca; ou {}

    // do sentenca; ou {} while(...);

    Scanner entrada = new Scanner(System.in);

    String texto = "";

    do {
      System.out.println("voce precisa falar" +
                       "\nas palavras mágicas,,,");
      System.out.print("quer sair? ");
      texto = entrada.nextLine();
    } while(!texto.equalsIgnoreCase("por favor"));

    System.out.println("obrigado!");
    entrada.close();
  }
}
