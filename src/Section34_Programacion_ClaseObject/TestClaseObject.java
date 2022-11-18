package Section34_Programacion_ClaseObject;

public class TestClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Kevin", 10_000);
        Empleado empleado2 = new Empleado("Kevin", 10_000);

        if (empleado1 == empleado2) System.out.println("Tienen la misma referencia en memoria.");
        else System.out.println("Tienen distinta referncia en memoria.");

        if (empleado1.equals(empleado2)) System.out.println("Son iguales los objetos.");
        else System.out.println("No son iguales los objetos.");

        if (empleado1.hashCode() == empleado2.hashCode())System.out.println("El valor hashcode es igual.");
        else System.out.println("Los valores son diferentes en el hashcode.");
    }
}
