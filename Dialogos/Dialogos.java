import javax.swing.JOptionPane;

public class Dialogos
{
     public static void main(String[] args)
     {
          JOptionPane.showMessageDialog(null, "Hola Bienvenido");
          JOptionPane.showMessageDialog(null, "Vas a escribir algo","Prueba 1",JOptionPane.WARNING_MESSAGE);
          String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
          JOptionPane.showMessageDialog(null, "Hola "+nombre);
     }
}