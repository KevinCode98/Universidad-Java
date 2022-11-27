package test;

import datos.Conexion;
import datos.UsuarioDao;
import datos.UsuarioDaoJDBC;
import domain.UsuarioDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestManejoUsuario {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            UsuarioDao usuarioDao = new UsuarioDaoJDBC(conexion);
            List<UsuarioDTO> usuarios = usuarioDao.seleccionar();

            usuarios.forEach(usuario -> System.out.println("usuario = " + usuario));
            conexion.commit();
            System.out.println("Se ha echo commit de la transacción.");
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
