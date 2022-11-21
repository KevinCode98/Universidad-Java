package Section42_Programacion_FinalCurso.datos;

import Section42_Programacion_FinalCurso.domain.Pelicula;
import Section42_Programacion_FinalCurso.excepciones.*;

import java.util.List;

public interface IAccesoDatos {
    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
