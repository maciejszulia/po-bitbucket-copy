package lista05;

import java.util.ArrayList;
import java.util.Collections;

public class zad1 {

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> output = new ArrayList<>();
        output.addAll(a);
        output.addAll(b);
        return output;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> output = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int len = 0;
        if (a.size() > b.size()) {
            len = b.size();
            temp = a;
        }
        if (a.size() < b.size()) {
            len = a.size();
            temp = b;
        }
        for (int i = 0; i < len; i++) {
            output.add(a.get(i));
            output.add(b.get(i));
        }
        for (int i = len; i < temp.size(); i++) {
            output.add(temp.get(i));
        }
        return output;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> output = merge(a, b);
        Collections.sort(output);
        return output;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a) {
        ArrayList<Integer> output = new ArrayList<>();
        int i = a.size() - 1;
        while (i != -1) {
            output.add(a.get(i));
            i--;
        }
        return output;
    }

    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer>temp = reversed(a);
        a.clear();
        a.addAll(temp);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println("Lista1: " + list1);
        System.out.println("Lista2: " + list2);

        // zad1
        System.out.println("ListaZad1: " + append(list1, list2));

        // zad2
        System.out.println("ListaZad2: " + merge(list1, list2));

        // zad3
        System.out.println("ListaZad3: " + mergeSorted(list1, list2));

        // zad4
        System.out.println("ListaZad4: " + reversed(list1));

        // zad5
        reverse(list2);
        System.out.println("ListaZad5: " + list2);
    }
}
