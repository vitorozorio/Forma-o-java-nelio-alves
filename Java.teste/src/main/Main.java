package main;

public class Main {

    public static double calcularProbabilidade(int resultadoEsperado, int totalResultados) {
        return (double) resultadoEsperado / totalResultados;
    }

    public static void main(String[] args) {
        // Cálculo da probabilidade de sair cara em uma moeda lançada
        double probabilidadeCara = calcularProbabilidade(1, 2);
        System.out.println("Probabilidade de sair cara: " + probabilidadeCara);

        // Cálculo da probabilidade de sair número 6 em um dado lançado
        double probabilidadeSeis = calcularProbabilidade(6, 6);
        System.out.println("Probabilidade de sair número 6: " + probabilidadeSeis);
    }

}


