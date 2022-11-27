package datos;

import domain.UsuarioDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoJDBC implements UsuarioDao{

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES (?, ?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    public UsuarioDaoJDBC() {
    }

    public UsuarioDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    // Obtener todos los registros de la tabla usuarios de la base de datos
    public List<UsuarioDTO> seleccionar() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        UsuarioDTO usuarioObjeto = null;
        List<UsuarioDTO> usuarios = new ArrayList<>();

        try {
            connection = (this.conexionTransaccional != null) ? this.conexionTransaccional
                    : Conexion.getConection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                var idUsuario = resultSet.getInt("id_usuario");
                var usuario = resultSet.getString("usuario");
                var password = resultSet.getString("password");

                usuarioObjeto = new UsuarioDTO(idUsuario, usuario, password);
                usuarios.add(usuarioObjeto);
            }
        } finally {
            try {
                Conexion.close(resultSet);
                Conexion.close(preparedStatement);
                if (this.conexionTransaccional == null) {
                    Conexion.close(connection);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    // Actualizar un usuario en la base de datos
    public int actualizar(UsuarioDTO usuario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;

        try {
            connection = (this.conexionTransaccional != null) ? this.conexionTransaccional
                    : Conexion.getConection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE);
            preparedStatement.setString(1, usuario.getUsuario());
            preparedStatement.setString(2, usuario.getPassword());
            preparedStatement.setInt(3, usuario.getIdUsuario());

            registros = preparedStatement.executeUpdate();
        } finally {
            try {
                Conexion.close(preparedStatement);
                if (this.conexionTransaccional == null) {
                    Conexion.close(connection);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    // Agregar un nuevo usuario a la base de datos
    public int insertar(UsuarioDTO usuario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;

        try {
            connection = (this.conexionTransaccional != null) ? this.conexionTransaccional
                    : Conexion.getConection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, usuario.getUsuario());
            preparedStatement.setString(2, usuario.getPassword());

            registros = preparedStatement.executeUpdate();
        } finally {
            try {
                Conexion.close(preparedStatement);
                if (this.conexionTransaccional == null) {
                    Conexion.close(connection);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    // Eliminar un usuario de la base de datos
    public int eliminar(UsuarioDTO usuario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;

        try {
            connection = (this.conexionTransaccional != null) ? this.conexionTransaccional
                    : Conexion.getConection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);
            preparedStatement.setInt(1, usuario.getIdUsuario());

            registros = preparedStatement.executeUpdate();
        } finally {
            try {
                Conexion.close(preparedStatement);
                if (this.conexionTransaccional == null) {
                    Conexion.close(connection);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
