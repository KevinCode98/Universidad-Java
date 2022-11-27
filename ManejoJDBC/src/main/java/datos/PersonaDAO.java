package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDAO {

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido,"
            + "email, telefono FROM persona";

    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido,"
            + "email, telefono) VALUES (?, ?, ?, ?)";

    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?,"
            + "email = ?, telefono = ? WHERE id_persona = ?";
  
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    // Obtener todos los registros de la tabla usarios de la base de datos
    public List<Persona> seleccionar() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            connection = Conexion.getConection();
            preparedStatement = connection.prepareStatement(SQL_SELECT);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                var idPersona = resultSet.getInt("id_persona");
                var nombre = resultSet.getString("nombre");
                var apellido = resultSet.getString("apellido");
                var email = resultSet.getString("email");
                var telefono = resultSet.getString("telefono");

                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(resultSet);
                Conexion.close(preparedStatement);
                Conexion.close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return personas;
    }

    // Atualizar una persona en la base de datos
    public int actualizar(Persona persona) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;
        try {
            connection = Conexion.getConection();
            preparedStatement = connection.prepareStatement(SQL_UPDATE);
            preparedStatement.setString(1, persona.getNombre());
            preparedStatement.setString(2, persona.getApellido());
            preparedStatement.setString(3, persona.getEmail());
            preparedStatement.setString(4, persona.getTelefono());
            preparedStatement.setInt(5, persona.getIdPersona());

            registros = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return registros;
    }

    // Agregar una nueva persona en la base de datos
    public int insertar(Persona persona) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;

        try {
            connection = Conexion.getConection();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, persona.getNombre());
            preparedStatement.setString(2, persona.getApellido());
            preparedStatement.setString(3, persona.getEmail());
            preparedStatement.setString(4, persona.getTelefono());

            registros = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(preparedStatement);
                Conexion.close(connection);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    // Eliminar una persona en la base de datos
    public int eliminar(Persona persona) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int registros = 0;
        try {
            connection = Conexion.getConection();
            preparedStatement = connection.prepareStatement(SQL_DELETE);
            preparedStatement.setInt(1, persona.getIdPersona());

            registros = preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return registros;
    }
}
