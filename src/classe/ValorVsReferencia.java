package classe;

public class ValorVsReferencia {

  public static void main(String[] args) {

    double a = 2;
    double b = a; // atribuição por valor (tipo primitivo)

    a++;
    b--;

    System.out.println(a + " " + b);

    Data d1 = new Data(1, 5, 2022);
    Data d2 = d1; // atribuição por referencia (Objeto)

    d1.dia = 31;
    d2.mes = 12;

    d1.ano = 2025;

    System.out.println(d1.obterDataFormatada());
    System.out.println(d2.obterDataFormatada());

    voltarDataParaValorPadrao(d1);

    System.out.println(d1.obterDataFormatada());
    System.out.println(d2.obterDataFormatada());

    int c = 5;
    alterarPrimitivo(c);
    System.out.println(c);
  }

  static void voltarDataParaValorPadrao(Data d) {
    d.dia = 1;
    d.mes = 2;
    d.ano = 1970;
  }

  static void alterarPrimitivo(int c){
    c++;
  }
}
