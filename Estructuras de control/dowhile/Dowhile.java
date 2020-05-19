import java.util.Scanner;
public class Dowhile{
     public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
          int valor;
          do{
               System.out.println("Ingrese un valor entre 0 y 999 (0 para terminar): ");
               valor = teclado.nextInt();
               if(valor >= 100){
               System.out.println("Su numero tiene 3 digitos ");
  
               }else{
                    if(valor >= 10){
                         System.out.println("Su numero tiene 2 digitos");
                    }else{
                         System.out.println("Su numero tiene 1 digitos");
                    }
               }

          }while(valor != 0);

          
          System.out.println("*******************************************");
          System.out.println("****************** Fin Dowhile ************");
          System.out.println("*******************************************");

     }
}