package Section42_Programacion_FinalCurso.servicio;

import Section42_Programacion_FinalCurso.datos.AccesoDatosImplementacion;
import Section42_Programacion_FinalCurso.datos.IAccesoDatos;
import Section42_Programacion_FinalCurso.domain.Pelicula;
import Section42_Programacion_FinalCurso.excepciones.AccesoDatosEx;
import Section42_Programacion_FinalCurso.excepciones.LecturaDatosEx;

public class CatalogoPeliculasImplementacion implements ICatalogoPeliculas {
    private final IAccesoDatos datos;

    public CatalogoPeliculasImplementacion() {
        this.datos = new AccesoDatosImplementacion();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        try {
            boolean anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso a datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            peliculas.forEach(pelicula -> {
                System.out.println("pelicula = " + pelicula);
            });
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso datos");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (LecturaDatosEx e) {
            System.out.println("Error de busqueda de datos");
            e.printStackTrace(System.out);
        }

        System.out.println("resultado = " + resultado);
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                this.datos.borrar(NOMBRE_RECURSO);
                this.datos.crear(NOMBRE_RECURSO);
            } else {
                this.datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx e) {
            System.out.println("Error al iniciar catalogo de películas");
            e.printStackTrace(System.out);
        }
    }
}
