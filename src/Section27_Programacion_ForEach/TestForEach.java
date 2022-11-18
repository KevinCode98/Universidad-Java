package Section27_Programacion_ForEach;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }

        System.out.println("\n----------------------------------");
        Persona[] personas = {new Persona("Juan"), new Persona("Karla"), new Persona("Kevin")};
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}
