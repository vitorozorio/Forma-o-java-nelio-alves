package org.example.Primeiro_Programa;

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
    }
}