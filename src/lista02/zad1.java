package lista02;

import java.util.Scanner;
import java.util.Random;

//
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
            System.out.print(tab[i] + ", ");
            i++;
        }
        System.out.println();

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

        //e)
        int count1 = 0, count2 = 0;
        i = 0;
        while (i != n) {
            if (tab[i] > 0)
                count1++;
            if (tab[i] < 0) {
                if (count1 < count2)
                    count1 = 0;
                else {
                    count2 = count1;
                    count1 = 0;
                }
            }
            i++;
        }
        System.out.println("Długosc najdłuzszego fragmentu tablicy, w którym wszystkie elementy sa dodatnie: " + count2);

        //f)
        i = 0;
        while (i != n) {
            if (tab[i] > 0) {
                tab[i] = 1;
            }
            if (tab[i] < 0)
                tab[i] = -1;
            i++;
        }

        i = 0;
        while (i != n) {
            System.out.print(tab[i] + ", ");
            i++;
        }
        System.out.println();

        //g)
        int lewy = skaner.nextInt();
        while (!(1 <= lewy && lewy < n)) {
            System.out.println("1 <= lewy < n");
            lewy = skaner.nextInt();
        }

        int prawy = skaner.nextInt();
        while (!(1 <= prawy && prawy < n)) {
            System.out.println("1 <= prawy < n");
            prawy = skaner.nextInt();
        }

        if (prawy < lewy) {
            int temp;
            temp = lewy;
            lewy = prawy;
            prawy = temp;
        }
        System.out.println("lewy = " + lewy + " prawy = " + prawy);

        int temp;
        for (i = 0; i <= n - 1; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if (lewy - 1 >= prawy - 1)
                    break;
                if (i == lewy - 1 && j == prawy - 1) {
                    temp = tab[lewy - 1];
                    tab[lewy - 1] = tab[prawy - 1];
                    tab[prawy - 1] = temp;
                    lewy++;
                    prawy--;
                }
            }
        }
        for (i = 0; i <= n - 1; i++) {
            System.out.println(tab[i]);
        }
        System.out.println(n);

    }
}

