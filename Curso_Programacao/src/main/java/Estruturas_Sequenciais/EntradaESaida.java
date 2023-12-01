package Estruturas_Sequenciais;
import java.util.Locale;
public class EntradaESaida {


    public static void main(String[] args){

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
