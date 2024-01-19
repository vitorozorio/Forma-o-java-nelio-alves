package org.example.Vetores.model;

import java.util.Scanner;

public class Vect {


    static Scanner sc = new Scanner(System.in);
    public static double sum(int n) {

        double[] vect = new double[n];

        for (int i=0; i<n; i++ ) {
            vect[i] = sc.nextDouble();
        }

        sc.close();

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        return avg;
    }
}