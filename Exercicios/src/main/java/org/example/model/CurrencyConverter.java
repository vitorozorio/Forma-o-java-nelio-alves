package org.example.model;

public class CurrencyConverter {

    private static final double  DOLLAR_PRICE = 3.10;
    private static final double IOF_PRICE = 0.06;

    public static double converterDollar(double value){
        double valorReal = value * DOLLAR_PRICE;
        double calcIof = valorReal * IOF_PRICE;
        return valorReal + calcIof;
    }

}
