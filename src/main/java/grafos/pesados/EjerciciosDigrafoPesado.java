package grafos.pesados;

public class EjerciciosDigrafoPesado {
    private DigrafoPesado digrafo;
    private int[][] fw;

    public EjerciciosDigrafoPesado(DigrafoPesado digrafo) {
        this.digrafo = digrafo;
        FW ejecutar = new FW(digrafo);
        fw= ejecutar.floydWarshall();
    }
//    Para un grafo dirigido usando la implementación del algoritmo de Floyd-Wharsall encontrar los
//    caminos de costo mínimo entre un vértice a y el resto. Mostrar los costos y cuáles son los caminos
    public void caminosDesdeVertice(int vertice){
        int tamaño = digrafo.cantidadDeVertices();
        FW ejecutar = new FW(digrafo);
        int dist[][] = ejecutar.minimasDistancias();
        int i, j, k;    
         i = vertice;
        for (k = 0; k < tamaño; k++)
        {
                for (j = 0; j < tamaño; j++)
                {
                    String camino = "camino a " + j; 
                    if (dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                        if(i==vertice){
                            camino = camino + k;
                        }
                    }
                    else{
                        if(dist[i][j] == 99999){
                            camino = camino + "no existe";
                        }
                        else{
                            camino = camino + dist[i][j];
                        }
                    }
                    
                }
        }
    }
    
}
