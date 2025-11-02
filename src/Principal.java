import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //objeto
        Filme meuFilme = new Filme("O Grinch", 1999);
        meuFilme.setDuracaoEmMinutos(180);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        Filme meuFilme2 = new Filme("Avatar", 2010);
        meuFilme2.setDuracaoEmMinutos(460);

        var meuFilme3 = new Filme("Barbie e as Três Mosqueteiras", 2010);
        meuFilme3.setDuracaoEmMinutos(90);
        meuFilme3.avalia(10);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Serie minhaSerie = new Serie("Hannibal", 2013);
        minhaSerie.setTemporadas(3);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.exibeFichaTecnica();
        System.out.println("Duração para maratonar: " + minhaSerie.getDuracaoEmMinutos() + " minutos");

        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(10000);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme3);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size() + " itens");
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());
    }
}
