package eeee;


import java.time.LocalTime;
import java.util.ArrayList;

public class egzamin1 {
    public static <T extends Comparable>ArrayList removeRepeatedElements(ArrayList<T> lista)
    {
        ArrayList<T>output = new ArrayList<T>();

        lista.stream().distinct().forEach(output::add);
        return output;
    }
    public static void main(String[] args){
        LocalTime t1 = LocalTime.of(11,30);
        LocalTime t2 = LocalTime.of(12,30);
        LocalTime t3 = LocalTime.of(13,30);
        LocalTime t4 = LocalTime.of(14,30);
        LocalTime t5 = LocalTime.of(14,30);

        ArrayList<LocalTime> localTimeArrayList = new ArrayList<>();

        localTimeArrayList.add(t1);
        localTimeArrayList.add(t2);
        localTimeArrayList.add(t3);
        localTimeArrayList.add(t4);
        localTimeArrayList.add(t5);

        Character a = 'a';
        Character b = 'b';
        Character c = 'c';
        Character b1 = 'b';
        Character c1 = 'c';

        ArrayList<Character> characterArrayList = new ArrayList<>();

        characterArrayList.add(a);
        characterArrayList.add(b);
        characterArrayList.add(c);
        characterArrayList.add(b1);
        characterArrayList.add(c1);

        ArrayList<Character>check1 = removeRepeatedElements(localTimeArrayList);
        for(int i=0;i<localTimeArrayList.);
    }
}