public class Encapsulamiento{
     private int tipo;
     private int edad;
     
     public void setTipo(int t){
          tipo = t;
     }
     public int getTipo(){
          return tipo;
     }

     public void setEdad(int e){
          edad = e;
     }

     public int getEdad(){
          return edad;
     }

}
class AcessoIndirecto{
     public static void main(String [] args){
          Encapsulamiento mc = new Encapsulamiento();
          mc.setTipo(4);
          System.out.println("El tipo es: "+mc.getTipo());
     }
}