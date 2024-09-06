package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.*;
import br.com.alura.screenmatch.desafios.*;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalDesafios {
        public static void main(String[] args) {
                // Desafio 1
                var ListaDePessoas = new ArrayList<Pessoa>();

                var Alfredo = new Pessoa();
                Alfredo.setNome("Alfredo");
                Alfredo.setIdade(52);
                var Juliana = new Pessoa("Juliana", 25);
                var Kaugamemods = new Pessoa("Kaugamemods", 23);

                ListaDePessoas.add(Alfredo);
                ListaDePessoas.add(Juliana);
                ListaDePessoas.add(Kaugamemods);

                System.out.println("Tamanho da lista:\t" + ListaDePessoas.size());
                System.out.println("A primeira pessoa é:\n" + Alfredo.toString());
                System.out.println("Todas as pessoas são:\n" + ListaDePessoas.toString());

                //////////////////////////////////////////////////////////////////////////////

                // Desafio 2
                var mandioca = new ProdutoPerecivel("mandioca", 18, 5, "23/04/2025");
                System.out.println(mandioca.toString());

                //////////////////////////////////////////////////////////////////////////////

                // Desafio 3
                // 1

                var listaStrings = new ArrayList<String>();
                listaStrings.add("banana");
                listaStrings.add("elefante");
                listaStrings.add("crisomelideo");
                for(String item:listaStrings)
                {
                        System.out.println(item);
                }
                //2
                var listaFormas = new ArrayList<Forma>();
                var Quadrado1 = new Quadrado(7);
                var Quadrado2 = new Quadrado(8.2);
                var Circulo1 = new Circulo(5);
                var Circulo2 = new Circulo(6.8);
                var Quadrado3 = new Quadrado(7.5);
                Collections.addAll(listaFormas,Quadrado1,Quadrado2,Circulo1,Circulo2,Quadrado3);
                int somador=0;
                for (Forma forma:listaFormas)
                {
                        somador++;
                        System.out.println("Área da forma n"+somador+": "+forma.calcularArea());
                }
                //////////////////////////////////////////////////////////////////////////////

        }
}
