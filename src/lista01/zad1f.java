package lista01;

import java.util.Scanner;

public class zad1f {

    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static double dodawaniePoteg(int n) {
        double wynik = 0;
        Scanner scannerDlaDodawania = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaDodawania.nextDouble();
            wynik += Math.pow(liczba, 2);
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }

    public static void main(String[] args) {

        int n = skanerDlaLab02();
        double wynikDodawaniePoteg = dodawaniePoteg(n);

        System.out.println("Wynik dodawania a1^2 + a2^2 + ... + an^2 = " + wynikDodawaniePoteg);

    }
}

//jest dobrze