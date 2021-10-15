package lab02;

import java.util.Scanner;

public class zad1f {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int n = scanner.nextInt();
        System.out.println("n = " + n);

        double wynik = 0;
        for (int i = 0; i < n; i++) {
            double liczba = scanner.nextDouble();
            wynik += Math.pow(liczba, 2); //do potegi drugiej
            System.out.println(wynik);
        }
        System.out.println("wynik = " + wynik);
    }
}

//jest dobrze