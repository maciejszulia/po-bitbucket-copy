package lab02;

import java.util.Scanner;

public class zad21b {
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
            if (tablica[i] % 3 == 0 && tablica[i] % 5 == 1)
                output++;
            i++;
        }
        System.out.println("Liczba takich liczb: " + output);
    }

}

