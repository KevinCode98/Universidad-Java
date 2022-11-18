package Section29_Programacion_ModificadoresAcceso.Paquete1;

class Clase4 {
    private String atributoPrivado = "Valor atributo privado";

    private Clase4() {
        System.out.println("Constructor privado.");
    }

    public Clase4(String str) {
        this();
        System.out.println("Constructor publico.");
    }

    private void metodoPrivado() {
        System.out.println("Método privado.");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
