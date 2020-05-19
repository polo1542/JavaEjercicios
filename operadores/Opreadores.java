public class Opreadores{
     public static void main(String[] args) {
          int c;
          c = 5;
          //Post incremento
          System.out.println("El valor inicial de c es: " + c);
          System.out.println("El valor de C ahora es: " + c++);
          System.out.println("El valor de C despues del incremento es: " + c);
          System.out.println("******************************************");
          //Post decremento
          System.out.println("El valor inicial de c es: " + c);
          System.out.println("El valor de C ahora es: " + c--);
          System.out.println("El valor de C despues del desincremento es: " + c);
          //Pre incremento
          System.out.println("******************************************");
          System.out.println("El valor inicial de c es: " + c);
          System.out.println("El valor de C ahora es: " + ++c);
          System.out.println("El valor de C despues del incremento es: " + c);
     }
}