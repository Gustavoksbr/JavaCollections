package br.com.alura.screenmatch.desafios;

public class Circulo implements Forma{

    private double raio;
    public double getRaio()
    {
        return raio;
    }
    public void setRaio()
    {
        this.raio = raio;
    }
    public Circulo(double raio)
    {
        this.raio = raio;
    }

    @Override
    public double calcularArea()
    {
        return 3.14 * Math.pow(raio,2) ;
    }
}
