package kolos;

import java.util.Date;

public class Sms extends Usluga {

    private String numer;

    Sms(Date czas) {
        super(czas);
    }

    @Override
    void obliczCene() {
        cena = 0.13;
    }

    public void konstruktor(Date czas, String numer) {
        this.czas = czas;
        this.numer = numer;
        obliczCene();
    }

    public String toString() {
        obliczCene();
        return ("Sms: numer " + numer +
                ", data i godzina smsa: " + czas +
                ", 0, łączny koszt: " + cena);
    }
}
