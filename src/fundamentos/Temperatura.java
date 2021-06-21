package fundamentos;

public class Temperatura {

  public static void main(String[] args) {
    // (ºF - 32) X 5/9 = ºC
    // º = ALT + 167num
    final double ajuste = 32;
    final double fator = 5/9.0;

    double fahrenheit = 86;
    double celsius = (fahrenheit - ajuste) * fator;
    System.out.println("O resultado é "+celsius + "ºC.");
    
    fahrenheit = 0;
    celsius = (fahrenheit - ajuste) * fator;
    System.out.println("O resultado é "+celsius + "ºC.");
  }
}
