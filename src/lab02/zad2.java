package lab02;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        //init scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");

        int liczba = scanner.nextInt();
        System.out.println("n = " + liczba);

        double[] TabLiczby = new double[liczba];
        for (int i = 0; i < TabLiczby.length; i++) {
            TabLiczby[i] = scanner.nextDouble();
        }

        double wynik = 1;
        for (int i = 0; i < TabLiczby.length - 1; i++) {
            //tutaj suma tablicy musi sie znalezc
        }

        System.out.println("wynik = " + wynik);
    }
}
