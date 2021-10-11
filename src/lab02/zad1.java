package lab02;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        //init scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");

        int liczba = scanner.nextInt();
        System.out.println("n = " + liczba);

        double wynik = 0;
        for (int i = 0; i < liczba; i++) {
            double n = scanner.nextDouble();
            wynik += n;
        }
        System.out.println("wynik = " + wynik);
    }
}