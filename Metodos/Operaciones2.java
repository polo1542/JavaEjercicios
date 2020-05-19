import java.util.Scanner;

public class Operaciones2{
     int n1;
     int n2;
     int sumar;
     int restar;
     int multiplicar;
     int dividir;
     //Metodos
     //                Parametros
     public void sumar(int n1, int n2)
     {
          sumar = n1 + n2;
     }

     ///////////////////////////////////////////

     public void restar(int n1, int n2)
     {
          restar = n1 - n2;
     }

     ///////////////////////////////////////////

     public void multiplicar(int n1, int n2)
     {
          multiplicar = n1 * n2;
     }

     ///////////////////////////////////////////

     public void dividir(int n1, int n2)
     {
          dividir = n1 / n2;
     }
     public void imprimirResutados(){
          System.out.println("La Suma es: "+ sumar);
          System.out.println("La Resta es: "+ restar);
          System.out.println("La multiplicacion es : "+ multiplicar);
          System.out.println("La division es: "+ dividir);

     }
     public static void main(String [] args)
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Metele joven un numero: " );
          int n1 = sc.nextInt();
          System.out.println("Metele joven otro numero: " );
          int n2 = sc.nextInt();
          //Creando otro objecto de la clase Operaciones

          Operaciones2 op = new Operaciones2();
//dentro de la invocacion
          //        Argumento
          //En este caso son variables :v 
          op.sumar(n1, n2);
          op.restar(n1,n2);
          op.multiplicar(n1,n2);
          op.dividir(n1,n2);
          op.imprimirResutados();
     }
}