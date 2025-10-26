package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme filme) {
//        tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void incluiSerie(Serie serie) {
//        tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
