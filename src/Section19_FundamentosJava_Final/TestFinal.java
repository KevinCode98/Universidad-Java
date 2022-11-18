package Section19_FundamentosJava_Final;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);

        // miVariable = 4; -> Esto marca un error por qur se utiliza como una constante
        System.out.println("Persona.MI_CONSTANTE = " + Persona.MI_CONSTANTE);

        final Persona persona1 = new Persona();
//        persona1 = new Persona(); -> No se permite darle una nueva referencia al objeto por ser final

        persona1.setNombre("Juan");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 nuevo nombre: " + persona1.getNombre());
    }
}
