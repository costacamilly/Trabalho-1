import java.util.Scanner;

public class Main {
  public static void main(String[] args) { 

    Scanner sc = new Scanner (System.in);
    
    System.out.println("Digite um número");
  
  int numero = sc.nextInt();
  if (numero >0 ){
  System.out.println("O número é positivo");
}
  if (numero < 0){
  System.out.println("O número é negativo");
  }
  

sc.close();

}
}