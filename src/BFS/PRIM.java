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
               
        while(!f.filaVazia()){
            Vertice u = f.extraiMinimo();
            id = u.getIndice();
            w = w + u.chave;
            for(i=0;i<g.listasDeAdjacencia[id].size();i++){
                Arco a = (Arco) g.listasDeAdjacencia[id].get(i);
                Vertice v = a.getDestino();
                int peso = a.getPeso();
                if(f.estaNaFila(v) && peso < v.chave){
                    int index = v.getIndice();
                    //Atualiza no objeto fila
                    f.fila[index].chave = peso;
                    f.fila[index].pai = u;
                }
                if(p > peso){
                    p = peso;
                }
            }
        }
        return w;
    }
}
