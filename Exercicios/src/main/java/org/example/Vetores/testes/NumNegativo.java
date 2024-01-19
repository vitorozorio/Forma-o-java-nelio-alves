package org.example.Vetores.testes;
import java.util.Scanner;

public class NumNegativo {


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] vect = new int[n];

    for(int i=0; i< vect.length; i++){
        vect[i] = sc.nextInt();
    }

    for(int i=0; i< vect.length; i++){

        if(vect[i] < 0){
            System.out.println("\nnumeros negativos : " + vect[i]);
        }

    }





    }



}
