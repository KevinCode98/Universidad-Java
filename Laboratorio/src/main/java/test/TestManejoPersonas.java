package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        // Insertar un nuevo objeto de tipo Persona
//        Persona personaNueva = new Persona("Luis", "Martinez", "luismtz@gmail.com", "3320304050");
//        personaDao.insertar(personaNueva);

        // Modificar una persona
//        Persona personaModificar = new Persona(4, "Juan Carlos", "Martinez",
//                "jcmartinez@gmail.com", "3320304050");
//        personaDao.actualizar(personaModificar);
        
        // Eliminar una persona
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);
        

        // Listamos las listas que se encuentran en la base de datos
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
