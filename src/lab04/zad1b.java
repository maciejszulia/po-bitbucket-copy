package lab04;

import java.util.Scanner;

public class zad1b {
    public static String mojSkanerString() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj napis: ");
        //        System.out.println("n = " + n);
        return skaner.next();
    }

    public static int countSubStr(String str, String subStr) {
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        if (subStr.length() > str.length()) {
            String temp = subStr;
            subStr = str;
            str = temp;
        }
        for (int i = 0; i <= sb.length() - 1; i++) {
            if ((sb.length() - 1) >= i + subStr.length() - 1) {
                String s = sb.substring(i, i + subStr.length());
                if (s.equals(subStr)) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String str = mojSkanerString();
        String subStr = mojSkanerString();

        System.out.println("Napis " + subStr + " wystapił w " + str + " " + countSubStr(str, subStr) + " razy.");

    }
}
