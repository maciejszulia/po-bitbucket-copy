package kolokwium;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.List;

public class Telefon implements IDodaj, IBiling {
    private List<Usluga> biling;

    @Override
    public void DodajPolaczenie(String number, int czasP) {
        Polaczenie newPolaczenie = new Polaczenie(LocalDateTime.now(), number, czasP);
        biling.add(newPolaczenie);
    }

    @Override
    public void DodajSms(String number) {
        Sms newSms = new Sms(LocalDateTime.now(), number);
        biling.add(newSms);
    }

    @Override
    public void DodajInternet(int iloscMB) {
        Internet newInternet = new Internet(LocalDateTime.now(), iloscMB);
        biling.add(newInternet);
    }

    @Override
    public String toString() {
        String bilingtxt = null;
        for (Usluga usluga : biling) {
            bilingtxt = bilingtxt + usluga.toString() + "\n";
        }
        return bilingtxt;
    }

    @Override
    public void ZapiszBiling() throws FileNotFoundException {
        PrintWriter out = new PrintWriter("biling.txt");
        out.println(biling.toString());
    }
}
