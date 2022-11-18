package Section10_FundamentosJava_AlcanceDeVariables;

public class Aritmetica {
    // Atributos de la clase
    // La declaración con variables var no son permitidas en los atributos de las clases
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
