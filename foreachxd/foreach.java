public class foreach{
     public static void main(String[] args){
          int[] arreglo = {1,2,3,4,5};
          int total = 0;
          //Recorrer arreglo totalmente con el este for bien perro
          for(int numero : arreglo){
               total += numero;
          }
          System.out.println("*************************");
          System.out.println("Suma total: " + total);

     }

}