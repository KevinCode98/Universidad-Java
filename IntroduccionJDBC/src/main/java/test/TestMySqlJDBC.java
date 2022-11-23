package test;

import java.sql.*;

public class TestMySqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "losabia123");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);

            while (resultado.next()) {
                System.out.println("Nombre persona " + resultado.getInt("id_persona") + ": " +
                        resultado.getString("nombre") + " " + resultado.getString("apellido"));
                System.out.println("Correo electronico: " + resultado.getString("email"));
                System.out.println("Telefono: " + resultado.getString("telefono"));
                System.out.println("-------------------------------------------");
            }

            // Cerrar conexiones que se hacen de petición
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
