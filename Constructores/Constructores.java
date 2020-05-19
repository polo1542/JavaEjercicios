//El Objecto se llama Constructores 
public class Constructores{
     //Atributos
     String nombre;
     String apellido;

     public Constructores(){
          /*
               *Solo contruye el objeto que chistosos
               *Metodo xd
               *No devuelve ningun valor 
               *de ahi en fuera podemos hacer otra accion 
          */
         System.out.println("Hola Soy un Constructor donde esta la chamba"); 
     }
     public Constructores(String nom, String ape){
          nombre = nom;
          apellido = ape;
          System.out.println("El constructor es: " + nombre + "y su apellido es " + apellido); 

     }

     public Constructores(int a, int b){
         int suma = a + b;
         System.out.println("La suma es: " + suma); 
     }
     //metodo copia       Argumentos necesario
     public Constructores(final Constructores objConstructor){
          nombre = objConstructor.nombre;
          apellido = objConstructor.apellido;


     }
     public static void main(String [] args){
          //Constructores obj = new Constructores();//invocando objecto :v

          //Constructores obj2 = new Constructores(1,1);

          Constructores obj3 = new Constructores("Paul","Vazquez");
          //Construtor copia
          Constructores obj4 = new Constructores(obj3);

          System.out.println("Nombre obj4 : " + obj4.nombre); 
          System.out.println("Apellido obj4 : " + obj4.apellido); 

     }
}