package classe;

public class Data {
  int dia;
  int mes;
  int ano;

  Data(){
    dia = 1;
    mes = 1;
    ano = 1970;
  }

  Data( int diaData, int mesData, int anoData){
    dia = diaData;
    mes = mesData;
    ano = anoData;
  }


  String obterDataFormatada(){
    return String.format("%d/%d/%d", dia, mes, ano);
  }
}
