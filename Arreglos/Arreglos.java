public class Arreglos{
     public static void main(String[] args){
          //Arreglo sin valores o dicho tecnicamente
          /**
           *SIN INICIALIZAR    
           */
          String[] arreglo1 = new String[5];
          //Inicializado
          int[] arreglo2 = {1,2,3,4,5,66};
          ////////////////////
          arreglo1[0] = "uno";
          arreglo1[1] = "dos";
          arreglo1[2] = "tres";
          arreglo1[3] = "cuatro";
          arreglo1[4] = "cinco";
          //mostrando datos de arreglo sin inicializar
          System.out.println(arreglo1[0]);
          //////////////////
          System.out.println(arreglo2[0]);
          //
          System.out.println("Tu arreglo tiene "+arreglo2.length);
          //Imprimiendo mas fast
          for(int i = 0; i < arreglo1.length; i++){
               System.out.println("Valor: "+arreglo1[i]);
          }
          for(int i = 0; i < arreglo2.length; i++){
               System.out.println("Valor: "+arreglo2[i]);
          }

     }
}