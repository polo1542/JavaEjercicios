import javax.swing.JFrame; 
import javax.swing.JPanel; 
import java.awt.Color;
import java.awt.Graphics;

public class Arcoiris extends JPanel{

     private final static Color VIOLETA = new Color(128,0,128);
     private final static Color INDIGO = new Color(75,0,130);
     //
     private Color [] colores = {Color.WHITE, Color.WHITE, VIOLETA, INDIGO,Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
     //Constructor
     public Arcoiris(){
           setBackground(Color.WHITE);
     }
     //Pintando el arcoirir
     public void paintComponent(Graphics g){
          super.paintComponent(g);
          int radio = 20;
          int centroX = getWidth()/2;
          int centroY = getHeight()-10;

          for(int i = colores.length; i > 0; i--){
               g.setColor(colores[i-1]);
               int valorX = centroX - i * radio;
               int valorY = centroY - i * radio;
               int ancho = i * radio * 2;
               int alto = i * radio * 2;

               g.fillArc(valorX,valorY,ancho,alto,0,180);
          }
     }
     public static void main(String[] args){
          Arcoiris panel = new Arcoiris();
          JFrame aplicacion = new JFrame();
          aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          aplicacion.add(panel);
          aplicacion.setSize(400,250);
          aplicacion.setVisible(true);
     }
}