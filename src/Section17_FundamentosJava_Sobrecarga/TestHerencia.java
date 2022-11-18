package Section17_FundamentosJava_Sobrecarga;


public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Kevin", 5_000.00);
        Empleado empleado2 = new Empleado("Juan", 8_000.00);
        Cliente cliente1 = new Cliente("Rodrigo", true);
        Cliente cliente2 = new Cliente("Monica", false);
        Cliente cliente3 = new Cliente("Alfonso", 'M', 23, "Zapopan 14", false);

        System.out.println("empleado1 = " + empleado1);
        System.out.println("empleado2 = " + empleado2);
        System.out.println("cliente1 = " + cliente1);
        System.out.println("cliente2 = " + cliente2);
        System.out.println("cliente3 = " + cliente3);
    }
}
