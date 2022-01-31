package egzamin;

public class egzamin1 {

    public static <T extends Comparable<T>> boolean isSorted(T[] tab) {

        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i].compareTo(tab[i + 1]) > 0)
                return false;
        }

        return true;
    }
}
