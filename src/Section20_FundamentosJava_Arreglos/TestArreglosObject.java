package Section20_FundamentosJava_Arreglos;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona[] personas = new Persona[3];

        personas[0] = new Persona("Kevin");
        personas[1] = new Persona("Juan");
        personas[2] = new Persona("Max");


        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas[" + i + "] = " + personas[i]);
        }
    }
}
