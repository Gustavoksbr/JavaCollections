import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;
import br.com.alura.screenmatch.Desafio1.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
//        Filme meuFilme = new Filme();
//        meuFilme.setNome("O poderoso chefão");
//        meuFilme.setAnoDeLancamento(1970);
//        meuFilme.setDuracaoEmMinutos(180);
//        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
//
//        meuFilme.exibeFichaTecnica();
//        meuFilme.avalia(8);
//        meuFilme.avalia(5);
//        meuFilme.avalia(10);
//        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
//        System.out.println(meuFilme.pegaMedia());
//        //meuFilme.somaDasAvaliacoes = 10;
//        //meuFilme.totalDeAvaliacoes = 1;
//        //System.out.println(meuFilme.pegaMedia());
//
//        Serie lost = new Serie();
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2000);
//        lost.exibeFichaTecnica();
//        lost.setTemporadas(10);
//        lost.setEpisodiosPorTemporada(10);
//        lost.setMinutosPorEpisodio(50);
//        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
//
//        Filme outroFilme = new Filme();
//        outroFilme.setNome("Avatar");
//        outroFilme.setAnoDeLancamento(2023);
//        outroFilme.setDuracaoEmMinutos(200);
//
//        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//        calculadora.inclui(meuFilme);
//        calculadora.inclui(outroFilme);
//        calculadora.inclui(lost);
//        System.out.println(calculadora.getTempoTotal());
//
//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(meuFilme);
//
//        Episodio episodio = new Episodio();
//        episodio.setNumero(1);
//        episodio.setSerie(lost);
//        episodio.setTotalVisualizacoes(300);
//        filtro.filtra(episodio);
//
        Filme filme1 = new Filme();
        filme1.setNome("Madagascar");
        Filme filme2 = new Filme();
        filme1.setNome("007");
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(filme1);
        listaFilmes.add(filme2);
        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Primeiro filme: " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);

//Desafio 1

//        var ListaDePessoas = new ArrayList<Pessoa>();
//
//        var Alfredo = new Pessoa();
//        Alfredo.setNome("Alfredo");
//        Alfredo.setIdade(52);
//        var Juliana = new Pessoa("Juliana",25);
//        var Kaugamemods = new Pessoa("Kaugamemods",23);
//
//        ListaDePessoas.add(Alfredo);
//        ListaDePessoas.add(Juliana);
//        ListaDePessoas.add(Kaugamemods);
//
//        System.out.println("Tamanho da lista:\t"+ListaDePessoas.size());
//        System.out.println("A primeira pessoa é:\n"+Alfredo.toString());
//        System.out.println("Todas as pessoas são:\n"+ListaDePessoas.toString());
    }
}