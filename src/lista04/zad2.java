package lista04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad2 {

    static int countCharFromFile(String filePath, char c) throws FileNotFoundException {
        int counter = 0;
        Scanner sc = new Scanner(new File(filePath));
        while (sc.hasNext()) {
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(countCharFromFile("C:\\Users\\macie\\IdeaProjects\\programowanie-obiektowe\\src\\lista04\\file", 'a'));

    }
}
