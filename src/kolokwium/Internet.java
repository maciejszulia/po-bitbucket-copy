package kolokwium;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

public class Internet extends Usluga {

    private int iloscMB;

    public Internet(LocalDateTime time, int iloscMB) {
        super(time);
        this.iloscMB = iloscMB;
    }

    @Override
    void obliczCene() {
        DecimalFormat f = new DecimalFormat("##.00");
        cena = Double.parseDouble(f.format(iloscMB / 755));
    }

    @Override
    public String toString() {
        return "Internet," + "data i godzina internetu:" + time + ", ilośćMB:" + iloscMB + ", łączny koszt:" + cena;
    }
}
