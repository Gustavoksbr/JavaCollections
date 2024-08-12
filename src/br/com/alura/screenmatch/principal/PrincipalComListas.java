package br.com.alura.screenmatch.principal;
import br.com.alura.screenmatch.modelos.*;
import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        meuFilme.avalia(4.5);
        outroFilme.avalia(8.2);
        outroFilme.avalia(3.8);
        filmeDoPaulo.avalia(7);
        lost.avalia(4.5);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            if (item instanceof Filme) {
            //Lost nao printa pq nao é Filme
                Filme filme = (Filme) item;
                System.out.println(item.getNome() +": Classificação " + filme.getClassificacao());
            }

        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);
    }
}



