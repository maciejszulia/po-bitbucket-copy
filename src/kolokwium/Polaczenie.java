package kolokwium;

import java.time.LocalDateTime;

public class Polaczenie extends Usluga {

    private String numer;
    private int czasP;


    public Polaczenie(LocalDateTime time, String numer, int czasP) {
        super(time);
        this.numer = numer;
        this.czasP = czasP;
        obliczCene();
    }

    @Override
    void obliczCene() {
        cena = czasP * 0.27;
    }

    @Override
    public String toString() {
        obliczCene();
        return ("Połączenie: numer " + numer +
                ", data i godzina rozmowy: " + time +
                ", długość trwania: " + czasP +
                ", łączny koszt: " + cena);
    }
}
