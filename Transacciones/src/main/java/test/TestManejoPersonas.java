package test;

import datos.*;
import domain.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
            cambioPersona.setNombre("Karla Ivonne");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kgomez@gmail.com");
            cambioPersona.setTelefono("3362319820");
            personaJDBC.actualizar(cambioPersona);

            Persona insertarPersona = new Persona();
            insertarPersona.setNombre("Alfonso");
            // insertarPersona.setApellido("Jashid sdlfkjsdfjlasdjflasjdlfjasldjfladsjfjdasfsdlfkjsdfjlasdjflasjdlfjasldjfladsjfjdasf");
            insertarPersona.setApellido("Jashid");
            insertarPersona.setEmail("ajashid@gmail.com");
            insertarPersona.setTelefono("3340923804");
            personaJDBC.insertar(insertarPersona);

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
