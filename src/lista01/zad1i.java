package lista01;

import java.util.Scanner;

public class zad1i {

    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static long silnia(int n) {
        long silnia = 1;
        for (int i = 2; i <= n; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }

    public static double dzialanie(int n) {
        double wynik = 0, temp = 1;
        Scanner skaner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = skaner.nextDouble();
            if (i % 2 == 0) {
                wynik -= liczba/(double) silnia(i+1);
                temp = liczba;
            } else {
                wynik += liczba/(double) silnia(i+1);
                temp = liczba;
            }
        }
        System.out.println("--endOfFunc--");
        return wynik + (Math.pow(-1, n + 1) * temp)/silnia(n);
    }

    public static void main(String[] args) {

        int n = skanerDlaLab02();
        double wynikDzialania = dzialanie(n);

        System.out.println("Wynik dzialania z podpunktu i = " + wynikDzialania);
    }
}
