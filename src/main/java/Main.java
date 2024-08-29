import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

    System.out.println("Qual o tipo de combustivel se tem preferencia");
    System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");

    
    int fim = sc.nextInt();
    
    
    while( fim > 4 ){
      System.out.println("Numero invalido. Digite novamente");
      fim = sc.nextInt();
    }
    if(fim == 1 ){
      System.out.println("Álcool");
        fim = sc.nextInt();
    }
    if(fim == 2 ){
      System.out.println("Gasolina");
        fim = sc.nextInt();
    }
    if(fim == 3 ){
      System.out.println("Diesel");
        fim = sc.nextInt();
    }
    if(fim != 4){
      
      fim = sc.nextInt();
    }
     System.out.println("Muito Obrigado");
    
    sc.close();
  }


}