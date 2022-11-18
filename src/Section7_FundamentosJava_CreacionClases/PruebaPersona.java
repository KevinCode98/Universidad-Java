package Section7_FundamentosJava_CreacionClases;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("--------- Persona 1 ---------");
        Persona p1 = new Persona();
        p1.nombre = "Kevin";
        p1.apellido = "Carrillo";
        p1.desplegarInformacion();

        System.out.println("--------- Persona 2 sin infromacion en atributos ---------");
        Persona p2 = new Persona();
        p2.desplegarInformacion();
        p2.nombre = "Max";
        p2.apellido = "Valencia";
        System.out.println("--------- Persona 2 ---------");
        p2.desplegarInformacion();


        System.out.println("--------- Direccion de memoria ---------");
        System.out.println("Persona 1 = " + p1);
        System.out.println("Persona 2 = " + p2);
    }
}
