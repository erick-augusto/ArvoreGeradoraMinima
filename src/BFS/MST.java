
package BFS;

public class MST {

    public static void main(String[] args) {
        //Leitura do teclado
        GrafoPonderado g = new GrafoPonderado();
        g.leDoTeclado();
        //g.imprimeNaTela();zz
        
        //Parâmetros da leitura do teclado:
        int n = g.totalDeVertices;
        PRIM prim = new PRIM();
        int p = prim.PRIM(g, 0, g.vertices[0]);
        System.out.println("Peso: "+p);
    }
    
    public int PRIM(GrafoPonderado g, int w, Vertice s){
        int i;
                
        for(i=0;i<g.totalDeVertices;i++){
            g.vertices[i].chave = Constantes.INFINITO;
            g.vertices[i].pai = null;
        }
        
        int id = s.getIndice();
        int p = Constantes.INFINITO;
        g.vertices[id].chave = 0;
        FilaDePrioridade f = new FilaDePrioridade(g.vertices);
    }
    
}
