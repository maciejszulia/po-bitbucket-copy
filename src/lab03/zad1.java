package lab03;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;


public class zad1 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner skaner = new Scanner(System.in);

        System.out.print("Podaj n: ");
        int n = skaner.nextInt();
        if (!(1 <= n && n <= 100))
            return;
        System.out.println("n = " + n);
        int[] tab = new int[n];

        int i = 0;
        while (i != n) {
            tab[i] = rand.nextInt(1000 + 999) - 999;
            System.out.println(tab[i]);
            i++;
        }

        // a)
        i = 0;
        int parzyste = 0, nieparzyste = 0;
        while (i != n) {
            if (tab[i] % 2 == 0)
                parzyste++;
            else
                nieparzyste++;
            i++;
        }
        System.out.println("Parzyste = " + parzyste + " nieparzyste = " + nieparzyste);

        // b)
        int dodatnie = 0, ujemne = 0, zero = 0;

        i = 0;
        while (i != n) {
            if (tab[i] > 0)
                dodatnie++;
            if (tab[i] < 0)
                ujemne++;
            if (tab[i] == 0)
                zero++;
            i++;
        }
        System.out.println("Dodatnie = " + dodatnie + " ujemne = " + ujemne + " zera = " + zero);


        // c)
        i = 0;
        int biggest = tab[0];
        while (i != n) {
            if (tab[i] > biggest)
                biggest = tab[i];
            i++;
        }
        int counter = 0;
        i = 0;
        while (i != n) {
            if (tab[i] == biggest)
                counter++;
            i++;
        }
        System.out.println("Najwiekszy element = " + biggest);
        System.out.println("Wystepuje on razy = " + counter);

        //d)
        i = 0;
        int negativeSum = 0, positiveSum = 0;
        while (i != n) {
            if (tab[i] > 0)
                positiveSum += tab[i];
            if (tab[i] < 0)
                negativeSum += tab[i];
            i++;
        }
        System.out.println("Suma dodatnich = " + positiveSum + " suma ujemnych = " + negativeSum);
    }
}
