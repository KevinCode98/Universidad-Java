package test;

import datos.*;
import domain.Usuario;
import java.sql.*;

public class TestManejoUsuario {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            UsuarioJDBC usuarioJDBC = new UsuarioJDBC(conexion);
            Usuario cambioUsuario = new Usuario();
            cambioUsuario.setIdUsuario(3);
            cambioUsuario.setUsuario("Luis");
            cambioUsuario.setPassword("1234567890");
            usuarioJDBC.actualizar(cambioUsuario);

            Usuario insertarUsuario = new Usuario();
            insertarUsuario.setUsuario("Andre");
            insertarUsuario.setPassword("0987654321");
            usuarioJDBC.insertar(insertarUsuario);

            conexion.commit();
            System.out.println("Se ha realizado el commit de la transación");
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al rollback");
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
