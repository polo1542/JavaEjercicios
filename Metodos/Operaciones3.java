import java.util.Scanner;

public class Operaciones3{
     //Metodos
     //                Parametros
     public int sumar(int n1, int n2)
     {
          int sumar = n1 + n2;
          return sumar;
     }

     ///////////////////////////////////////////

     public int restar(int n1, int n2)
     {
         int restar = n1 - n2;
          return restar;
     }

     ///////////////////////////////////////////

     public int multiplicar(int n1, int n2)
     {
          int multiplicar = n1 * n2;
          return multiplicar;
     }

     ///////////////////////////////////////////

     public int dividir(int n1, int n2)
     {
          int dividir = n1 / n2;
          return dividir;
     }     
     //declaracion de metodo
     public void imprimirResutados(int sumar, int restar, int multiplicar, int dividir){
          System.out.println("La Suma es: "+ sumar);
          System.out.println("La Resta es: "+ restar);
          System.out.println("La multiplicacion es : "+ multiplicar);
          System.out.println("La division es: "+ dividir);
     }

     //Creando otro objecto de la clase Operaciones
     public static void main(String [] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Metele joven un numero: " );
          int n1 = sc.nextInt();
          System.out.println("Metele joven otro numero: " );
          int n2 = sc.nextInt();

          Operaciones3 op = new Operaciones3();
          //       Argumentos
          int sumar = op.sumar(n1, n2);
          int restar = op.restar(n1,n2);
          int multiplicar = op.multiplicar(n1,n2);
          int dividir = op.dividir(n1,n2);
          op.imprimirResutados(sumar, restar, multiplicar, dividir);//invocacio 
     }
}
