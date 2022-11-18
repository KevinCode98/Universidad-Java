package Section19_FundamentosJava_Final;

public class Empleado extends Persona { // extends Persona -> Error porque es una clase final

    @Override
    public void imprimir() {
        System.out.println("Método imprimir desde la clase hija");
    } // -> Si el método padre no queremos que se modifique se coloca el final
    // Pero si puede sobreescribirse no se agrega el final en el método padre
}
