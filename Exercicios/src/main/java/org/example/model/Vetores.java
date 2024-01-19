package org.example.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vetores {

    public static void ExerDois(int n){
        Scanner sc = new Scanner(System.in);
        double[] vect = new double[n];

        for(int i=0; i<vect.length; i++){
            vect[i] = sc.nextDouble();
            System.out.printf("valores : %.2f%n " + vect[i]);
        }

        double sum = 0.0;

        for (int i=0; i<vect.length; i++){
            sum += vect[i];
        }
        double result = sum / n;

        System.out.printf("resultado da media : %.2f%n " + result);

    }

    public static void ExerTres (int n){
        Scanner sc = new Scanner(System.in);
        Pessoa[] Vect = new Pessoa[n];

        for (int i = 0; i < Vect.length; i++) {

            System.out.print("Informe o nome do pessoa : ");
            String name = sc.next();

            System.out.print("Informe a idade da pessoa : ");
            int idade = sc.nextInt();

            System.out.print("Informe a altura da pessoa : ");
            double altura = sc.nextDouble();

            Vect[i] = new Pessoa(name, idade, altura);
            System.out.println(Vect[i]);

        }

        for (int i = 0; i < n; i++){
            System.out.println(Vect[i]);
        }

    }

    public static void ExerQuatro(int n){

    }

    
    }


}
