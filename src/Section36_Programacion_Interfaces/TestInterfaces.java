package Section36_Programacion_Interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql();
        imprimir(datos);

        datos = new ImplementacionOracle();
        imprimir(datos);
    }

    public static void imprimir(IAccesoDatos datos) {
        System.out.println("Clase: " + datos.getClass().getSimpleName());
        datos.listar();
        datos.actualizar();
        datos.eliminar();
        System.out.println("---------------------------");
    }
}
