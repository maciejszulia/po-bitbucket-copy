package lab02;

import java.util.Scanner;
import java.lang.Math;

public class zad23 {
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
        double[] tablica = new double[n];

        int i = 0;
        int dodatnie = 0, ujemne = 0, zera = 0;
        while (i != tablica.length) {
            tablica[i] = skaner.nextDouble();
            if (tablica[i] > 0)
                dodatnie++;
            if (tablica[i] < 0)
                ujemne++;
            if (tablica[i] == 0)
                zera++;
            i++;
        }
        System.out.println("Dodatnie = " + dodatnie + " ujemne = " + ujemne + " zera = " + zera);
    }

}

