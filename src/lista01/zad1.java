package lista01;

import java.util.ArrayList;
import java.util.Scanner;

public class zad1 {

    public static ArrayList<Double> numbers() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = skaner.nextInt();
        while (n < 0) {
            System.out.println("N < 0");
            n = skaner.nextInt();
        }
        System.out.println("n = " + n);
        ArrayList<Double> output = new ArrayList<>();
        System.out.println("Podaj " + n + " liczb: ");
        for (int i = 0; i < n; i++) {
            output.add(skaner.nextDouble());
        }
        return output;
    }

    public static double dodawanie(ArrayList<Double> numbers) {
        double wynik = 0;
        for (double liczba : numbers) {
            wynik += liczba;
        }
        return wynik;
    }

    public static double mnozenie(ArrayList<Double> numbers) {
        double wynik = 1;
        for (double liczba : numbers) {
            wynik *= liczba;
        }
        return wynik;
    }

    public static double dodawanieAbs(ArrayList<Double> numbers) {
        double wynik = 0;
        for (double liczba : numbers) {
            wynik += Math.abs(liczba);
        }
        return wynik;
    }

    public static double dodawanieAbsSqrt(ArrayList<Double> numbers) {
        double wynik = 0;
        for (double liczba : numbers) {
            wynik += Math.sqrt(Math.abs(liczba));
        }
        return wynik;
    }

    public static double mnozenieAbs(ArrayList<Double> numbers) {
        double wynik = 1;
        for (double liczba : numbers) {
            wynik *= Math.abs(liczba);
        }
        return wynik;
    }

    public static double dodawaniePoteg(ArrayList<Double> numbers) {
        double wynik = 0;
        for (double liczba : numbers) {
            wynik += Math.pow(liczba, 2);
        }
        return wynik;
    }

    public static double dzialanieH(ArrayList<Double> numbers) {
        double wynik = 0;
        for (int i = 0; i < numbers.size(); i++) {
            double liczba = numbers.get(i);
            if (i % 2 == 0) {
                wynik += liczba;
            } else {
                wynik -= liczba;
            }
        }
        return wynik;
    }

    public static long silnia(int n) {
        long silnia = 1;
        for (int i = 2; i <= n; i++) {
            silnia = silnia * i;
        }
        return silnia;
    }

    public static double dzialanieI(int n) {
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
        return wynik + (Math.pow(-1, n + 1) * temp)/silnia(n);
    }

    public static void main(String[] args) {

        ArrayList<Double> numbers = numbers();
        System.out.println(numbers);

        // 1-a
        System.out.println("Wynik dodawania = " + dodawanie(numbers));

        // 1-b
        System.out.println("Wynik mnożenia = " + mnozenie(numbers));

        // 1-c
        System.out.println("Wynik dodawania z wartości bezwzględnych = " + dodawanieAbs(numbers));

        // 1-d
        System.out.println("Wynik dodawania z sqrt(wartości bezwzględnych) = " + dodawanieAbsSqrt(numbers));

        // 1-e
        System.out.println("Wynik mnożenia |a1| * |a2| * ... * |an| = " + mnozenieAbs(numbers));

        // 1-f
        System.out.println("Wynik dodawania a1^2 + a2^2 + ... + an^2 = " + dodawaniePoteg(numbers));

        // 1-g
        System.out.println("wynik dodawania = " + dodawanie(numbers) + " wynik mnożenia = " + mnozenie(numbers));

        // 1-h
        System.out.println("Wynik działania z podpunktu h = " + dzialanieH(numbers));


        // 1-i
        System.out.println("Wynik dzialania z podpunktu i = " + dzialanieI(numbers.size()));

    }
}
