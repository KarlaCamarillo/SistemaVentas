package Modelo;

import javax.swing.JOptionPane;
import java.sql.*;
public class Conexion {

    //Nombre del servidor. localhost:3306 es la ruta y el puerto de la conexión MySQL
    private String url = "jdbc:mysql://localhost:3306/prueba_ventas?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String user = "root";
    private String password = "";
    private Connection conector = null;

    public Connection Conectar(){
        try {
            //Driver JDBC
            Class.forName("com.mysql.jdbc.Driver");
            //Se inicia la conexión
            conector = DriverManager.getConnection(url, user, password);
            //System.out.println("Conexion exitosa");
            //JOptionPane.showMessageDialog(null, "Conexion correcta");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error en la conexión a la base de datos: " + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
         return conector;
    }

    public void cerrar() throws SQLException {
        if (conector != null) {
            conector.close();
        }
    }
     public Connection estado(){
        return conector;
    }

    PreparedStatement prepareStatement(String sSQL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}