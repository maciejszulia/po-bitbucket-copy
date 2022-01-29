package kolokwium;

import java.time.LocalDateTime;

public class Sms extends Usluga {

    private String numer;

    public Sms(LocalDateTime time, String numer) {
        super(time);
        this.numer = numer;
        obliczCene();
    }

    @Override
    void obliczCene() {
        cena = 0.13;
    }

    @Override
    public String toString() {
        return "Sms{" + "numer " + numer + ", data i godzina smsa: " + time + ", łączny koszt: " + cena;
    }
}
