package lab05;


import java.lang.StringBuffer;
import java.io.*;
import java.math.*;
import java.util.Scanner;

import static java.lang.Character.*;


public class zad1 {
    static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        return count;
    }

    static int countSubStr(String str, String subStr) {
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        if (sb.length() > str.length()) {
            return 0;
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

    static String middle(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder output = new StringBuilder();
        if (str.length() % 2 == 0) {
            output.append(sb.charAt(sb.length() / 2 - 1));
            output.append(sb.charAt(sb.length() / 2));
        } else {
            output.append(sb.append(sb.length() / 2));
        }
        return output.toString();
    }

    static String repeat(String str, int n) {
        StringBuilder temp = new StringBuilder(str);
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < n; i++) {
            output.append(temp);
        }
        return output.toString();
    }

    static int[] where(String str, String subStr) {
        int n = countSubStr(str, subStr);
        int[] where = new int[n];
        int j = 0;
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i <= sb.length() - 1; i++) {
            if ((sb.length() - 1) >= i + subStr.length() - 1) {
                String s = sb.substring(i, i + subStr.length());
                if (s.equals(subStr)) {
                    where[j] = i;
                    j++;
                }
            }
        }
        return where;
    }

    static String change(String str) {
        StringBuilder output = new StringBuilder();
        StringBuilder temp = new StringBuilder(str);
        for (int i = 0; i < temp.length(); i++) {
            if (isLowerCase(temp.charAt(i))) {
                output.append(toUpperCase((temp.charAt(i))));
            }
            if (isUpperCase(temp.charAt(i))) {
                output.append(toLowerCase((temp.charAt(i))));
            }
        }
        return output.toString();
    }

    static String nice(String str) {
        StringBuilder orgStr = new StringBuilder(str);
        orgStr.reverse();
        StringBuilder output = new StringBuilder();
        int i = 0;
        while (i != str.length()) {
            output.append(orgStr.charAt(i));
            if ((i + 1) % 3 == 0 && i != str.length() - 1) {
                output.append('`');
            }
            i++;
        }
        return output.reverse().toString();
    }

    static String nice(String str, char separator, int range)
    {
        StringBuilder orgStr = new StringBuilder(str);
        orgStr.reverse();
        StringBuilder output = new StringBuilder();
        int i = 0;
        while (i != str.length()) {
            output.append(orgStr.charAt(i));
            if ((i + 1) % range == 0 && i != str.length() - 1) {
                output.append(separator);
            }
            i++;
        }
        return output.reverse().toString();
    }

    public static void main(String[] args) {

        //a
        String str = "aaaabbbbccc";
        char c = 'a';
        System.out.println("Litera " + c + " wystąpiła razy: " + countChar(str, c));

        //b
        String s = "aaabbbccc";
        String sub = "bb";
        System.out.println("Napis " + sub + " wystąpił razy: " + countSubStr(s, sub));

        //c
        String strC = "middle";
        System.out.println("Środek napisu " + strC + ": " + middle(strC));

        //d
        String strD = "ho";
        System.out.println(repeat(strD, 5));

        //e
        String sE = "hehehihihehe";
        String subE = "he";
        int[] tab = where(s, sub);
        for (int index : tab) {
            System.out.print(index + " ");
        }
        System.out.println();


        //f
        System.out.println(change("XdxD"));

        //g
        System.out.println(nice("100000000"));

        //h
        System.out.println(nice("100000", ',', 2));
    }
}
