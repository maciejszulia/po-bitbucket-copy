package lab04;

import java.util.Scanner;

public class zad1a {
    static int countChar(String str, char c) {
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        int i = 0;
        while (i != sb.length()) {
            if (sb.charAt(i) == c) {
                count++;
            }
            i++;
        }
        return count;
    }

    public static String mojSkanerString() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        //        System.out.println("n = " + n);
        return skaner.next();
    }

    public static char mojSkanerChar() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj znak: ");
        //        System.out.println("n = " + n);
        return skaner.next().charAt(0);
    }


    public static void main(String[] args) {
        String str = mojSkanerString();
        char c = mojSkanerChar();
//        System.out.println("Napis: " + str + ", znak: " + c);
        System.out.println("Liczba wystąpień znaku " + c + " w napisie " + str + ": " + countChar(str, c));
    }
}
