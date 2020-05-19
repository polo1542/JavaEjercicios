
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConvercionObjectos{
         public static final String URL = "jdbc:mysql://localhost:8080/bd_ganaderos"; //Direccion, puerto y nombre de la Base de Datos
    public static final String USERNAME = "root"; //Usuario de Acceso a MySQL
    public static final String PASSWORD = "vacp990914"; //Password del usuario
        public static com.mysql.jdbc.Connection getConection() {
            com.mysql.jdbc.Connection cone = null;
            System.out.println("Hola Preparando Conexion");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            cone = (com.mysql.jdbc.Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Lista la ßConexion");

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return cone;
    }  
}