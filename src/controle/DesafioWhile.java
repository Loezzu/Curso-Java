package controle;

import java.util.Scanner;

public class DesafioWhile {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int quantidadeDeNotas = 0;
    double nota = 0;
    double total = 0;
    while(nota != -1){
      System.out.print("informe a nota (ou digite 1 para sair) ");
      nota = ler.nextDouble();
      if (nota <= 10 && nota >= 0){
        total += nota;
        quantidadeDeNotas++;
      } else if (nota != -1){
        System.out.println("nota inválida");
      }
    }

    double media = total / quantidadeDeNotas;
    System.out.println("Média " + media);

    ler.close();
  }
}
