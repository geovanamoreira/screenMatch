package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Grinch", 1999);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.avalia(9);

        Filme meuFilme2 = new Filme("Avatar", 2010);
        meuFilme2.setDuracaoEmMinutos(460);
        meuFilme2.avalia(10);

        Serie minhaSerie = new Serie("Hannibal", 2013);
        minhaSerie.setTemporadas(3);

        //shift f6 seleciona todos com o mesmo nome e renomeia de uma vez
        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(minhaSerie);

        for (Titulo item: lista) {
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Ariana Grande");
        buscaPorArtista.add("Ronaldinho Gaucho");

        System.out.println("Em ordem");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);
    }
}
