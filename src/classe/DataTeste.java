package classe;

public class DataTeste {

  public static void main(String[] args) {

    Data d1 = new Data();
    d1.dia = 12;
    d1.mes = 12;
    d1.ano = 2002;

    var d2 = new Data();
    d2.dia = 28;
    d2.mes = 4;
    d2.ano = 2018;

    String dataFormatada1 = d1.obterDataFormatada();
    System.out.println(dataFormatada1);
    System.out.println(d2.obterDataFormatada());

  }
}
