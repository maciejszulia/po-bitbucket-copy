package lab02;

import java.util.Scanner;

public class zad1b {
    public static void main(String[] args) {

        //init scanner - zrob scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");

        //liczba = zeskanuj kolejnego inta
        int liczba = scanner.nextInt();
        System.out.println("n = " + liczba);

        double[] tabLiczby = new double[liczba];
        for (int i = 0; i < tabLiczby.length; i++) {
            tabLiczby[i] = scanner.nextDouble();
        }

        double wynik = 1;
        for (int i = 0; i < tabLiczby.length; i++) {
            wynik *= tabLiczby[i];
        }

        System.out.println("wynik = " + wynik);
    }
}
