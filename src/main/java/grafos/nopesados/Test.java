package grafos.nopesados;

import com.mycompany.arboles.excepciones.ExcepcionAristaYaExiste;
import com.mycompany.arboles.excepciones.ExcepcionNroVerticesInvalido;

public class Test {

    public static void main(String[] args) throws ExcepcionNroVerticesInvalido, ExcepcionAristaYaExiste {
        Grafo grafo = new Grafo(6);
        grafo.insertarArista(0,1);
        grafo.insertarArista(1,2);
        grafo.insertarArista(0,2);
        grafo.insertarArista(2,3);
        grafo.insertarArista(1,4);
        
        //Ejercicio 1
        System.out.println(grafo);
        System.out.println("Ejercicio 1, eliminar vertice 2");
        grafo.eliminarVertice(2);
        System.out.println(grafo);
        
        System.out.println("Ejercicio 2: hay ciclo en digrafo");
        Digrafo digrafo = new Digrafo(5);
        digrafo.insertarArista(0, 1);
        digrafo.insertarArista(1, 3);
        digrafo.insertarArista(3, 0);
        digrafo.insertarArista(3, 4);
        System.out.println(digrafo);
        EjerciciosDigrafo ejecutar = new EjerciciosDigrafo(digrafo);
        System.out.println(ejecutar.hayCiclo());
        System.out.println("EJ 3: ELEMENTOS DE LAS ISLAS");
        ejecutar.elementosIslas();
        System.out.println("EJ 4: Desde que vertices se puede llegar a un vertice (3)");
        System.out.println(ejecutar.elementosPadre(3));
        System.out.println("EJ 5: Desde que vertice se puede llegar a un vertice (3) usando recorridos");
        System.out.println(ejecutar.elementosPadre2(3));
        System.out.println("Ejercicio 6: hay ciclo en digrafo");
         System.out.println(ejecutar.hayCiclo());
         System.out.println("Ejercicio 7: es debilmente conexo?");
         System.out.println(ejecutar.esDebilmenteConexo());
         
         EjerciciosGrafo execute = new EjerciciosGrafo(grafo);
         System.out.println("Ejercicio 9: numero islas del grafo");
         System.out.println(grafo);
         System.out.println(execute.islas());
         
         System.out.println("Ejercicio 10: cant islas del digrafo");
         System.out.println(digrafo);
         System.out.println(ejecutar.cantIslas());
         
         System.out.println("Ejercicio 11: implementar el algoritmo de warshall");
         System.out.println(digrafo);
         AW procesar = new AW(digrafo);
         procesar.showMatriz(procesar.algoritmoWharsall());
         
    }

}
