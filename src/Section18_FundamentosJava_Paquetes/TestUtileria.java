package Section18_FundamentosJava_Paquetes;

//import Section18_FundamentosJava_Paquetes.mx.com.kevincode.Utileria;
// import Section18_FundamentosJava_Paquetes.mx.com.kevincode.*; Importa todas las clases que se encuentren
// en la carpeta


// import static Section18_FundamentosJava_Paquetes.mx.com.kevincode.Utileria.imprimir; Importa el método de la
// clase que se ha apuntado en el path

public class TestUtileria {
    public static void main(String[] args) {
        // Utileria.imprimir("Hola mundo");
        // imprimir("Esta es una impresión con un import del método");
        Section18_FundamentosJava_Paquetes.mx.com.kevincode.Utileria.imprimir("Impresión con todo el path");
    }
}
