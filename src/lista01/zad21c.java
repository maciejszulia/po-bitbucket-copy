package lista01;

import java.util.Scanner;
import java.lang.Math;

public class zad21c {
    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static void main(String[] args) {

        Scanner skaner = new Scanner(System.in);
        int n = skanerDlaLab02();
        int[] tablica = new int[n];

        int i = 0, output = 0;
        while (i != tablica.length) {
            tablica[i] = skaner.nextInt();
            if (Math.sqrt(tablica[i]) == (int)Math.sqrt(tablica[i]))
                output++;
            i++;
        }
        System.out.println("Liczba takich liczb: " + output);
    }

}

