package Section37_Programacion_JavaBeans;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Kevin");
        persona.setApellido("Carrillo");

        System.out.println("persona = " + persona);
        System.out.println("Persona nombre = " + persona.getNombre());
        System.out.println("Persona apellido = " + persona.getApellido());
    }
}
