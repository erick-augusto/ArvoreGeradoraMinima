/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BFS;

public class PRIM {
    
    PRIM(){
        
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
