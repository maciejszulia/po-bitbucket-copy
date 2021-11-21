/*
package lab02;

import java.util.Scanner;

public class zad1a {
    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static double dodawanie(int n) {
        double wynik = 0;
        Scanner scannerDlaDodawania = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaDodawania.nextDouble();
            wynik += liczba;
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }

    public static void main(String[] args) {

        int n = skanerDlaLab02();

        double wynikDodawania = dodawanie(n);
        System.out.println("Wynik dodawania = " + wynikDodawania);
    }
}

package lab02;

import java.util.Scanner;

public class zad1b {
    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static double mnozenie(int n) {
        double wynik = 1;
        Scanner scannerDlaMnozenia = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaMnozenia.nextDouble();
            wynik *= liczba;
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }

    public static void main(String[] args) {

        int n = skanerDlaLab02();

        double wynikMnozenia = mnozenie(n);
        System.out.println("Wynik mnozenia = " + wynikMnozenia);

    }
}

package lab02;

import java.util.Scanner;
import java.lang.Math;

public class zad1c {

    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static double dodawanieAbs(int n) {
        double wynik = 0;
        Scanner scannerDlaDodawania = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaDodawania.nextDouble();
            wynik += Math.abs(liczba);
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }


    public static void main(String[] args) {

        int n = skanerDlaLab02();
        double wynikDodawaniaAbs = dodawanieAbs(n);

        System.out.println("Wynik dodawania z wartosci bezwzglednych = " + wynikDodawaniaAbs);
    }
}

package lab02;

import java.util.Scanner;
import java.lang.Math;

public class zad1d {

    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static double dodawanieAbsSqrt(int n) {
        double wynik = 0;
        Scanner scannerDlaDodawania = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaDodawania.nextDouble();
            wynik += Math.sqrt(Math.abs(liczba));
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }


    public static void main(String[] args) {

        int n = skanerDlaLab02();
        double wynikDodawaniaAbsSqrt = dodawanieAbsSqrt(n);

        System.out.println("Wynik dodawania z sqrt(wartosci bezwzglednych) = " + wynikDodawaniaAbsSqrt);
    }
}

package lab02;

import java.util.Scanner;

public class zad1e {

    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static double mnozenieAbs(int n) {
        double wynik = 1;
        Scanner scannerDlaMnozenia = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaMnozenia.nextDouble();
            wynik *= Math.abs(liczba);
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }

    public static void main(String[] args) {

        int n = skanerDlaLab02();
        double wynikMnozenieAbs = mnozenieAbs(n);

        System.out.println("Wynik mnozenia |a1| * |a2| * ... * |an| = " + wynikMnozenieAbs);

    }
}

package lab02;

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

package lab02;

import java.util.Scanner;

public class zad1g {

    public static double dodawanie(int n) {
        double wynik = 0;
        Scanner scannerDlaDodawania = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaDodawania.nextDouble();
            wynik += liczba;
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }

    public static double mnozenie(int n) {
        double wynik = 1;
        Scanner scannerDlaMnozenia = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = scannerDlaMnozenia.nextDouble();
            wynik *= liczba;
        }
        System.out.println("--endOfFunc--");
        return wynik;
    }

    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static void main(String[] args) {

        int n = skanerDlaLab02();
        double wynikDodawania = dodawanie(n);
        double wynikMnozenia = mnozenie(n);

        System.out.println("wynik dodawania = " + wynikDodawania + " wynik mnozenia = " + wynikMnozenia);
    }
}

package lab02;

import java.util.Scanner;

public class zad1h {

    public static int skanerDlaLab02() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int n = skaner.nextInt();
        System.out.println("n = " + n);
        return n;
    }

    public static double dzialanie(int n) {
        double wynik = 0, temp = 1;
        Scanner skaner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            double liczba = skaner.nextDouble();
            if (i % 2 == 0) {
                wynik += liczba;
                temp = liczba;
            } else {
                wynik -= liczba;
                temp = liczba;
            }
        }
        System.out.println("--endOfFunc--");
        return wynik + Math.pow(-1, n + 1) * temp;
    }

    public static void main(String[] args) {

        int n = skanerDlaLab02();
        double wynikDzialania = dzialanie(n);

        System.out.println("Wynik dzialania z podpunktu h = " + wynikDzialania);
    }
}


package lab02;

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

package lab02;


import java.util.Scanner;

public class zad12 {
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
        int i=0;
        double[] tablica = new double[n];
        while(i!=n){
            tablica[i] =  skaner.nextDouble();
            System.out.println(tablica[i]);
            i++;
        }

        i=1;
        while (i!=n-1){
            System.out.println(tablica[i]);
            i++;
        }
        System.out.println(tablica[0]);
    }
}

package lab02;

import java.util.Scanner;

public class zad21a {
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
        int[] tablica = new int[n];

        int i = 0, checkIfOdd = 0;
        while (i != tablica.length) {
            tablica[i] = skaner.nextInt();
            if (tablica[i] % 2 == 1)
                checkIfOdd++;
            i++;
        }
        System.out.println("Liczba nieparzystych: " + checkIfOdd);
    }

}

package lab02;

import java.util.Scanner;

public class zad21b {
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
        int[] tablica = new int[n];

        int i = 0, output = 0;
        while (i != tablica.length) {
            tablica[i] = skaner.nextInt();
            if (tablica[i] % 3 == 0 && tablica[i] % 5 == 1)
                output++;
            i++;
        }
        System.out.println("Liczba takich liczb: " + output);
    }

}

package lab02;

import java.util.Scanner;
import java.lang.Math;

public class zad21c {
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
        int[] tablica = new int[n];

        int i = 0, output = 0;
        while (i != tablica.length) {
            tablica[i] = skaner.nextInt();
            if (Math.sqrt(tablica[i]) == (int)Math.sqrt(tablica[i]))
                output++;
            i++;
        }
        System.out.println("Liczba takich liczb: " + output);
    }

}

package lab02;

import java.util.Scanner;
import java.lang.Math;

public class zad21d {
    //todo
}

package lab02;

import java.util.Scanner;
import java.lang.Math;

public class zad22 {
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

        int i = 0, output = 0;
        double wynik = 0;
        while (i != tablica.length) {
            tablica[i] = skaner.nextDouble();
            if (tablica[i]>0)
                wynik += (tablica[i]*2);
            i++;
        }
        System.out.println("Wynik = " + wynik);
    }

}

package lab02;

import java.util.Scanner;
import java.lang.Math;

public class zad23 {
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
        int dodatnie = 0, ujemne = 0, zera = 0;
        while (i != tablica.length) {
            tablica[i] = skaner.nextDouble();
            if (tablica[i] > 0)
                dodatnie++;
            if (tablica[i] < 0)
                ujemne++;
            if (tablica[i] == 0)
                zera++;
            i++;
        }
        System.out.println("Dodatnie = " + dodatnie + " ujemne = " + ujemne + " zera = " + zera);
    }

}

package lab02;

import java.util.Scanner;
import java.lang.Math;

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




 */