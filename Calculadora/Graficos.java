import javax.swing.JOptionPane;

public class Graficos{
     public static void main(String[] args){
         String n1 = JOptionPane.showInputDialog("Escribe un numero");
         String n2 = JOptionPane.showInputDialog("Escribe otro numero");
         //Hacer La conversion la conversion de cadena a double
         double num1 = Double.parseDouble(n1);
         double num2 = Double.parseDouble(n2);
         //////////////////////////////////////////////////////
         Operaciones op = new Operaciones();

         double suma = op.sumar(num1, num2);
         double resta = op.restar(num1, num2);
         double mult = op.multiplicar(num1, num2);
         double div = op.dividir(num1, num2);
          
          JOptionPane.showMessageDialog(null, "Suma: "+suma);
          JOptionPane.showMessageDialog(null, "Resta: "+resta);
          JOptionPane.showMessageDialog(null, "Multiplicacion: "+mult);
          JOptionPane.showMessageDialog(null, "Division: "+div);
     }
}

public class Operaciones{
     public double sumar(double x, double y){
          double suma = x + y;
          return suma;
     }
     public double restar(double x, double y){
          double resta = x - y;
          return resta;
     }
     public double multiplicar(double x, double y){
          double multiplicacion = x * y;
          return multiplicacion;
     }
     public double dividir(double x, double y){
          double division = x / y;
          return division;
     }
}