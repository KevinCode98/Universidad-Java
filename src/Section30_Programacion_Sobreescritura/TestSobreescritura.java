package Section30_Programacion_Sobreescritura;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Kevin", 20_000.0, "Desarrollador");
        System.out.println("gerente.obtenerDetalles() = " + gerente.obtenerDetalles());
    }
}
