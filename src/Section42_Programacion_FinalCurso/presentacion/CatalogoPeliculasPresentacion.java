package Section42_Programacion_FinalCurso.presentacion;

import Section42_Programacion_FinalCurso.servicio.CatalogoPeliculasImplementacion;
import Section42_Programacion_FinalCurso.servicio.ICatalogoPeliculas;

import java.util.Scanner;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImplementacion();


        while (opcion != 0) {
            System.out.println("Elige una opción: \n" +
                    "1.- Iniciar catalogo películas\n" +
                    "2.- Agregar película\n" +
                    "3.- Listar películas\n" +
                    "4.- Buscar películas\n" +
                    "0.- Salir");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la película");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce una película a buscar: ");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no reconocida");
                    break;
            }
        }
    }
}
