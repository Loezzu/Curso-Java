package arrays;

import java.util.Scanner;

public class DesafioArray {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Quantas notas quer armazenar? ");
    int numDeNotas = ler.nextInt();

    double[] notasAluno = new double[numDeNotas];
    
    for (int i = 0; i < notasAluno.length; i++) {
      System.out.println("Digite a nota " + (i + 1) + ": ");
      notasAluno[i] = ler.nextDouble();
    }

    double total = 0;
    for (double nota: notasAluno) {
      total += nota;
    }

    double media = total / notasAluno.length;
    System.out.println("A média é: " + media + "!");

    ler.close();
  }
}
