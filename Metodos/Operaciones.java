import java.util.Scanner;
//Clase Operaciones
public class Operaciones{
     //Atributos
     int n1, n2;
     int sumar;
     int restar;
     int multiplicar;
     int dividir;
     //Metodos
     public void leerNumeros()
     {
          //Objecto
          Scanner sc = new Scanner(System.in);
          //Fin del objecto
          System.out.println("Escribe un numero");
          n1 = sc.nextInt();

          System.out.println("Escribe otro numero");
          n2 = sc.nextInt();
     }

     ////////////////////////////////////////////

     public void sumar()
     {
          sumar = n1 + n2;
     }

     ///////////////////////////////////////////

     public void restar()
     {
          restar = n1 - n2;
     }

     ///////////////////////////////////////////

     public void multiplicar()
     {
          multiplicar = n1 * n2;
     }

     ///////////////////////////////////////////

     public void dividir()
     {
          dividir = n1 / n2; 
     }
     public void imprimirResutados(){
          System.out.println("La Suma es: "+ sumar);
          System.out.println("La Resta es: "+ restar);
          System.out.println("La multiplicacion es : "+ multiplicar);
          System.out.println("La division es: "+ dividir);
     }
     //Creando otro objecto de la clase Operaciones
     public static void main(String [] args)
     {
          Operaciones op = new Operaciones();//creando objecto
          //haciendo que el objecto realize los metodos :V osea lo invocamos
          op.leerNumeros();
          op.sumar();
          op.restar();
          op.multiplicar();
          op.dividir();
          op.imprimirResutados();
     }
}