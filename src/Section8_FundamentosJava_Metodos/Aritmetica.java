package Section8_FundamentosJava_Metodos;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;

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
