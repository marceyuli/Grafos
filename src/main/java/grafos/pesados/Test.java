
package grafos.pesados;

public class Test {
    public static void main(String[] args) {
        DigrafoPesado digrafo = new DigrafoPesado(4);
        digrafo.insertarArista(0, 1, 50);
        digrafo.insertarArista(0, 2, 30);
        digrafo.insertarArista(1, 3, 10);
        digrafo.insertarArista(2, 1, 1);
        System.out.println(digrafo);
        System.out.println("Ejercicio 12 Algoritmo FLOYD WARSHALL");
       FW ejecutar = new FW(digrafo);
       ejecutar.showMatriz(ejecutar.floydWarshall());
    }
}
