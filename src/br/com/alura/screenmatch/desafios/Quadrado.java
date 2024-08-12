package br.com.alura.screenmatch.desafios;

public class Quadrado implements Forma{
    private double lado;
    public double getLado()
    {
        return lado;
    }
    public void setLado()
    {
        this.lado = lado;
    }
    public Quadrado(double lado)
    {
        this.lado = lado;
    }

    @Override
    public double calcularArea()
    {
        return lado * lado;
    }
}
