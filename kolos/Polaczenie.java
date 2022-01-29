package kolos;

import java.sql.Time;
import java.util.*;


public class Polaczenie extends Usluga {

    private String numer;
    private int czasP;

    Polaczenie(Date czas) {
        super(czas);
    }

    @Override
    void obliczCene() {
        cena = czasP * 0.27;
    }

    public void konstruktor(String numer, Date czas, int czasP) {
        this.czas = czas;
        this.numer = numer;
        this.czasP = czasP;
        obliczCene();
    }

    @Override
    public String toString() {
        obliczCene();
        return ("Połączenie: numer" + numer +
                "4, data i godzina rozmowy:" + czas +
                ", długość trwania: " + czasP +
                ", łączny koszt: " + cena);
    }

}
