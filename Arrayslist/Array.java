import java.util.ArrayList;
public class Array{
     public static void main(String[] args){
          //Creando objecto y constructor
          ArrayList< String > array = new ArrayList<String>();
          //Usando metodo que es add
          array.add("rojo");
          array.add("azul");
          array.add("gris");
          array.add("verde");
          //Otros metodos
          //array.clear();

          //Vamo a recorrer el array con el super for
          for(String elemento : array){
               System.out.println("Tenemos estos colores: "+elemento);
          }
          //
          if(array.contains("verde")){
               System.out.println("Si hay verde :)");

          }else{
               System.out.println("No tienes ese color :(");
          }
          if(array.contains("Amarillo")){
               System.out.println("Si tienes ese color :]");

          }else{
               System.out.println("No tienes ese color :(");
          }
          //
          System.out.println("Esta vacia en tu coleccion? "+array.isEmpty());
          array.clear();
          System.out.println("Esta vacia tu coleccion ahora? "+array.isEmpty());

     }
}