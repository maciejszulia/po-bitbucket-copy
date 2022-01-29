package kolos;

import java.util.Date;

public class Internet extends Usluga {

    private int iloscMB;

    Internet(Date czas) {
        super(czas);
    }

    @Override
    void obliczCene() {
        cena = iloscMB / 755;
    }

    public void konstruktor(Date czas, int iloscMB) {
        this.czas = czas;
        this.iloscMB = iloscMB;
        obliczCene();
    }

    public String toString() {
        obliczCene();
        return ("Internet, data i godzina internetu:" + czas +
                ", ilośćMB: : " + iloscMB +
                "łączny koszt: " + cena);
    }
}
