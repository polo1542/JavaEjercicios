import javax.swing.Icon;//se importa libreria icon
import javax.swing.ImageIcon;//se importa libreria imagen icono
import javax.swing.JButton;// se importa el JButtom
import javax.swing.JFrame;//Se importa el Jframe

public class Jbuttom {//Se genera la clase publica Jbuttom
  public static void main(String args[]) {//En el metodo principal se declara todo xd
    JFrame frame = new JFrame("DefaultButton");//Se declara un nuevo Jframe
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Se le indica que se cierra y se cerrara el proceso
    Icon warnIcon = new ImageIcon("polo.jpg");//Se mete la magen en nuestra variable warnIcon en el metodo Icon
    JButton button2 = new JButton(warnIcon);//Se declara un nuevo boton y en el se instancia el warnIcon
    //Solo agregamos los elementos al frame que ya se habia relaizado
    frame.add(button2);//agregar el boton
    frame.setSize(300, 200);//tama;o
    frame.setVisible(true);//le indicamos que sea visible
  }
}