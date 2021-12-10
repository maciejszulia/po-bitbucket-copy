package lista01;

import java.util.ArrayList;
import java.util.Scanner;

public class zad21 {

    public static ArrayList<Integer> numbers() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int n = skaner.nextInt();
        while (n < 0) {
            System.out.println("N < 0");
            n = skaner.nextInt();
        }
        System.out.println("n = " + n);
        ArrayList<Integer> output = new ArrayList<>();
        System.out.println("Podaj " + n + " liczb: ");
        for (int i = 0; i < n; i++) {
            output.add(skaner.nextInt());
        }
        return output;
    }

    public static int checkIfOdd(ArrayList<Integer> numbers) {
        int oddCounter = 0;
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                oddCounter++;
            }
        }
        return oddCounter;
    }

    public static int checkIfDivisible(ArrayList<Integer> numbers) {
        int output = 0;
        for (Integer number : numbers) {
            if (number % 3 == 0 && !(number % 5 == 0)) {
                output++;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = numbers();
        System.out.println(numbers);

        // 2-1a
        System.out.println("Liczba nieparzystych: " + checkIfOdd(numbers));

        // 2-1b
        System.out.println("Liczba podzielnych przez 3 i niepodzielnych przez 5: " + checkIfDivisible(numbers));

    }

}

