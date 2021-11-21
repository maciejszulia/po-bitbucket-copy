package lab04;

import java.util.Scanner;

public class zad1c {

    public static String middle(String s) {
        StringBuffer sb = new StringBuffer(s);
        StringBuffer str = new StringBuffer();
        if (sb.length() % 2 == 0) {
            str.append(sb.charAt(sb.length() / 2 - 1)).append(sb.charAt(sb.length() / 2));
        }
        if (s.length() % 2 != 0) {
            str.append(sb.charAt(sb.length() / 2));
        }
        return str.toString();
    }

    public static String mojSkanerString() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        //        System.out.println("n = " + n);
        return skaner.next();
    }

    public static void main(String[] args) {

    }
}
