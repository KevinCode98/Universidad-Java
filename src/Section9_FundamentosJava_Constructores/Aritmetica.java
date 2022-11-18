package Section9_FundamentosJava_Constructores;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

    // Constructores
    public Aritmetica() {
        System.out.println("Ejecutando Constructor!");
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos!");
    }

    // Metodos de la clase
    public void sumar() {
        int resultado = this.a + this.b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}
