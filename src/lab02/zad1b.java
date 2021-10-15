package lab02;

import java.util.Scanner;

public class zad1b {
    public static void main(String[] args) {

        //init scanner - zrob scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        //liczba = zeskanuj kolejnego inta
        int n = scanner.nextInt();
        System.out.println("n = " + n);

        double wynik = 1;
        double[] tabLiczby = new double[n];
        for (int i = 0; i < tabLiczby.length; i++) {
            tabLiczby[i] = scanner.nextDouble();
            wynik *= tabLiczby[i];
            System.out.println(wynik);  //todo: mozna to zrobic inaczej: wynik *= liczba;
        }

        System.out.println("wynik = " + wynik);
    }
}
