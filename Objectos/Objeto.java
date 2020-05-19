//Creando Clase que se llama Objecto
public class Objeto{
    String nombre;//Atributo 1
    String color;//Atributo 2
     public static void main(String [] args){


          Objeto objeto1 = new Objeto();//Objecto 1
          Objeto objeto2  = new Objeto();//Objecto2

          objeto1.nombre="Polo";
          objeto2.nombre="Pablo";

          objeto1.color="Azul";
          objeto2.color="Negro";


          System.out.println("**************************** Imprimiendo Objeto 1 **************************");

          System.out.println(" Su Nombre del objecto es : "+ objeto1.nombre);
          System.out.println(" Su Color del objecto es: "+ objeto1.color);

          System.out.println("**************************** Imprimiendo Objeto 2 **************************");

          System.out.println(" Su Nombre del objecto es: "+ objeto2.nombre);
          System.out.println(" Su Color del objecto es: "+ objeto2.color);
          System.out.println("*******************************************************************************************************************");

     
     }
}