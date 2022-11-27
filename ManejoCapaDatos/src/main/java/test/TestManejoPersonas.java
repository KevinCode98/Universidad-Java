package test;

import datos.*;
import domain.*;

import java.sql.*;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDao personaDao = new PersonaDaoJDBC(conexion);
            List<PersonaDTO> personas = personaDao.seleccionar();

            personas.forEach(persona -> System.out.println("persona = " + persona));

            conexion.commit();
            System.out.println("Se ha echo commit de la transacción.");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback.");
            try {
                conexion.rollback();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }
}
