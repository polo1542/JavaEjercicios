import java.util.Scanner;

public class Teclado{
    public static void main(String[] args){
        //Objeto
        //Tipo de dato //identificador = construccion del objeto
        Scanner scanner = new Scanner (System.in);
        System.out.println("Escribe tu edad: ");
        //El objeto esta esperando un valor en la consola
        //Se agrega INT para indicar donde se guarda el valor del usuario
        int edad = scanner.nextInt();
        System.out.println("Tu edad es "+ edad);
        System.out.println("Gracias");
    }
}