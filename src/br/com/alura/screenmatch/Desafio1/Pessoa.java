package br.com.alura.screenmatch.Desafio1;

public class Pessoa {

    private String nome;
    private int idade;

    public void setNome(String Nome){this.nome = Nome;}
    public  String getNome(){return this.nome;}
    public void setIdade(int Idade){this.idade = Idade;}
    public int getIdade(){return this.idade;}

    public Pessoa() {}

    public Pessoa(String n, int i){
        setNome(n);
        setIdade(i);
    }
    @Override
    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade + "\n";
    }
}
