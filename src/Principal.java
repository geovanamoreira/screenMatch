import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        //objeto
        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        meuFilme.setNome("O Grinch");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(180);

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Avatar");
        meuFilme2.setAnoDeLancamento(2010);
        meuFilme2.setDuracaoEmMinutos(460);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(6);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        minhaSerie.setNome("Hannibal");
        minhaSerie.setAnoDeLancamento(2013);
        minhaSerie.setTemporadas(3);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.exibeFichaTecnica();
        System.out.println("Duração para maratonar: " + minhaSerie.getDuracaoEmMinutos() + " minutos");

        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());
    }
}
