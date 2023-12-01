package org.example.model;

public class AreaRetangulo {

    private double largura;
    private double altura;

    public AreaRetangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double area(double a, double b) {
        return a*b;
    }

    private double perimetro(double a, double b) {
        return 2*(a+b);
    }

    private double diagonal(double a, double b){
        double c = a*a + b*b;
        return Math.sqrt(c);
    }

    @Override
    public String toString() {
        return "area :" + area(largura , altura) +
                "\n" + "perimetro :" + perimetro(largura,altura)+
                "\n" + "diagonal :" + diagonal(largura,altura);
    }
}
