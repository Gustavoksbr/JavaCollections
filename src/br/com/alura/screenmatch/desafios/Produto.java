package br.com.alura.screenmatch.desafios;

public class Produto {
    private String nome;
    private int preco;
    private int quantidade;
    public Produto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    public String toString(){
        return "nome:"+nome+" preco:"+preco+" quantidade:"+quantidade;
    }

}
