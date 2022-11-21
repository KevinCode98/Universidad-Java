package Section39_Programacion_APICollections;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        // Esto permite duplicar los elementos en la lista
        miLista.add("Viernes");
        imprimir(miLista);

        // Colecciones tipo SET
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        // No permite duplicar los elementos en la set
        miSet.add("Viernes");
        imprimir(miSet);


        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Kevin");
        miMapa.put("valor3", "Luis");
        miMapa.put("valor4", "Karla");
        String elemento = (String) miMapa.get("valor2");
        System.out.println("elemento = " + elemento);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }


    public static void imprimir(Collection collection) {
        collection.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

        System.out.println("----------------------------------");
    }
}
