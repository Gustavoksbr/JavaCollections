package br.com.alura.screenmatch.desafios;

public class Pessoa {

    private String nome;
    private int idade;
    public Pessoa() {}

    public Pessoa(String n, int i){
        setNome(n);
        setIdade(i);
    }

    public void setNome(String Nome){this.nome = Nome;}
    public  String getNome(){return this.nome;}
    public void setIdade(int Idade){this.idade = Idade;}
    public int getIdade(){return this.idade;}


    @Override
    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade + "\n";
    }
}
