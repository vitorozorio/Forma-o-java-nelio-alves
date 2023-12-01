package org.example.Primeiro_Programa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    //class main

    public static void main(String[] args) {

        //metodo main (da o inicio ao programa !)

        //objeto de entrada de dados
        Scanner Sc = new Scanner(System.in);

        //variaveis
        String texto;

        System.out.println("insira um texto");//saida de dados

        texto = Sc.nextLine();//entrada de dados
        Sc.close();

        System.out.println("o texto escrito foi : " + texto );//saida de dados
        
        for(int i = 0; i<= 10; i++){

            System.out.println(i);

        }

        escreva();


    }
    public static void escreva(){
        String product1 = "computer";
        String product2 = "office desk";

        int age = 30;
        int cod = 5290;
        char grender = 'f';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.print("products :");
        System.out.printf("%s , which price is $ %.2f \n%s which price is $ %.2f ", product1 , price1, product2, price2 );
        System.out.printf("\n\nrecord : %d years old, code %d and gender : %s \n", age, cod, grender);
        System.out.printf("Measure with eight decimal places : %.8fn", measure);
        System.out.printf("\nRouded (three decimal places): %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point : %.3f ", measure);
    }
}