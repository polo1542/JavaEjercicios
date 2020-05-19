public class Sobrecarga{

     public void sumar(){
          System.out.println("Este metodo no recibe nada");
     }
     public void sumar(int x, int y){
         System.out.println("Este metodo recibe dos numeros enteros"); 
     }
     public void sumar(int x){
          System.out.println("Este metodo recibe un numero entero"); 

     }
     public void sumar(double x){         
          System.out.println("Este metodo recibe un decimal"); 
          
     }
     public static void main(String[] args){
          Sobrecarga sobreC = new Sobrecarga();
          sobreC.sumar();

     }
}