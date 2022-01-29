package kolokwium;

import java.time.LocalDateTime;

public abstract class Usluga {
    public Usluga(LocalDateTime time) {
        this.time = time;
    }

    protected LocalDateTime time;
    protected double cena;

    void obliczCene() {
    }
}
