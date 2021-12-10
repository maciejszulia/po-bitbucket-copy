package lista01;

import java.util.Scanner;

public class zad24 {
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
        double smallest = tablica[0], biggest = tablica[0];
        while (i != tablica.length) {
            tablica[i] = skaner.nextDouble();
            if (tablica[i] < smallest)
                smallest = tablica[i];
            if (tablica[i] > biggest)
                biggest = tablica[i];
            i++;
        }
        System.out.println("Najmniejsza = " + smallest + " najwieksza = " + biggest);
    }

}

