/**
 *Atributos y metodos de clase
 *@author Paul Vazquez
 */
public class Estaticos{
     //Sin la palabra static cada objecto se maneja de forma independiente
     //CON LA PALABRA STATIC cada objecto comparte el mismo valor sin ninguna independencia 
     String atrib = "Atributo";

     public static int sumar(int x, int y){
          int suma = x + y;
          return suma;
     }
     public static void main(String[] args){
          Estaticos est1 = new Estaticos();
          Estaticos est2 = new Estaticos();
          est1.atrib = "Ya cambiamos el Atributo";
          String var1 = est1.atrib;
          String var2 = est2.atrib;
          
          System.out.println("Variable 1 es = "+ var1); 
          System.out.println("Variable 2 es = "+ var2);
          //Se pueden llamar sin la instancia solo en los metodos estatic0s checate esto :v
          int suma  = Estaticos.sumar(5,10); 
          System.out.println("Resultado es = "+ suma);
   
     }
}