package Section40_Programacion_Generics.APIColeccionesGenericas;

import java.util.*;

public class TestColecionesGenericas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
        System.out.println("elemento -> List main = " + elemento);
        imprimir(miLista);

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Kevin");
        miMapa.put("Valor3", "Karla");
        miMapa.put("Valor3", "Carlos"); // --> Sobre escribe el valor de la llave "Valor3"

        String elementoMapa = miMapa.get("Valor1");
        System.out.println("elementoMapa = " + elementoMapa);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }


    public static void imprimir(Collection<String> collection) {
        collection.forEach(elemento -> {
            System.out.println("elemento = " + elemento.toLowerCase());
        });
        System.out.println("---------------------------");
    }
}
