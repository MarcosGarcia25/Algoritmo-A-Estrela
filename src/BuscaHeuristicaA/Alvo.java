/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuscaHeuristicaA;

import java.util.ArrayList;

/**
 *
 * @author marcos
 */
public class Alvo {
    private Vertice alvo;

    public Alvo(Vertice alvo) {
        this.alvo = alvo;
    }

    public Vertice getAlvo() {
        return alvo;
    }

    public void setAlvo(Vertice alvo) {
        this.alvo = alvo;
    }

    
    public ArrayList<CaminhoResultante> melhor_caminho(Vertice inicio, double tam_caminho, ArrayList<Aresta> arestas, ArrayList<CaminhoResultante> caminho){
        if(inicio.getDistanceParaOAlvo() == 0){
            return caminho;
        }

        Vertice aux = null;

        double menor = tam_caminho + inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(0), arestas) + inicio.vizinhos(arestas).get(0).getDistanceParaOAlvo();
        aux = inicio.vizinhos(arestas).get(0);
        
        double menorCaminho = inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(0), arestas) + tam_caminho;
        for(int i=0; i<inicio.vizinhos(arestas).size(); i++){
            if(inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(i), arestas) + inicio.vizinhos(arestas).get(i).getDistanceParaOAlvo() +tam_caminho <= menor){
                menor = inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(i), arestas) + tam_caminho + inicio.vizinhos(arestas).get(i).getDistanceParaOAlvo();
                System.out.println(inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(i), arestas));
                menorCaminho = inicio.getDistanciaParaVizinho(inicio.vizinhos(arestas).get(i), arestas) + tam_caminho;
                aux = inicio.vizinhos(arestas).get(i);
            }
        }
        caminho.add(new CaminhoResultante(aux, menorCaminho));
        if(inicio.getDistanceParaOAlvo() > 0){
            melhor_caminho(aux, menorCaminho, arestas, caminho);
        }
        return caminho;
    }
    
}
