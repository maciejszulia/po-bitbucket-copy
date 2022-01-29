package kolos;

import java.sql.Time;
import java.util.*;

public abstract class Usluga {
    protected Date czas;
    protected double cena;

    abstract void obliczCene();

    Usluga(Date czas) {
        System.out.println(czas);

    }
}
