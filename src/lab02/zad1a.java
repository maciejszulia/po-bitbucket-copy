package lab02;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class zad1a {
    public static void main(String[] args) {

        //init scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");

        int n = scanner.nextInt();
        System.out.println("n = " + n);

        double wynik = 0;
        for (int i = 0; i < n; i++) {
            double liczba = scanner.nextDouble();
            wynik += liczba;
            System.out.println(wynik);
        }
        System.out.println("wynik = " + wynik);
    }
}

//jest dobrze