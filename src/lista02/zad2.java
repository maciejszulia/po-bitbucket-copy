package lista02;

import java.util.Random;
import java.util.Scanner;

public class zad2 {
    public static int MojSkaner() {
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        //        System.out.println("n = " + n);
        return skaner.nextInt();
    }

    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc) {
        int i = 0;
        Random rand = new Random();
        while (i != n) {
            tab[i] = tab[i] = rand.nextInt(maxWartosc + 1 - minWartosc) + minWartosc;
            i++;
        }
    }

    public static void printTab(int[] tab) {
        int i = 0;
        while (i != tab.length) {
            System.out.println(tab[i] + " ");
            i++;
        }
    }

    public static int ileParzystych(int[] tab) {
        int i = 0;
        int parzyste = 0;
        while (i != tab.length) {
            if (tab[i] % 2 == 0) {
                parzyste++;
            }
            i++;
        }
        return parzyste;
    }

    public static int ileNieparzystych(int[] tab) {
        int i = 0;
        int nieparzyste = 0;
        while (i != tab.length) {
            if (tab[i] % 2 != 0) {
                nieparzyste++;
            }
            i++;
        }
        return nieparzyste;
    }

    public static int ileDodatnich(int[] tab) {
        int i = 0, dodatnie = 0;
        while (i != tab.length) {
            if (tab[i] > 0) {
                dodatnie++;
            }
            i++;
        }
        return dodatnie;
    }

    public static int ileUjemnych(int[] tab) {
        int i = 0, ujemne = 0;
        while (i != tab.length) {
            if (tab[i] < 0) {
                ujemne++;
            }
            i++;
        }
        return ujemne;
    }

    public static int ileZerowych(int[] tab) {
        int i = 0, zera = 0;
        while (i != tab.length) {
            if (tab[i] == 0) {
                zera++;
            }
            i++;
        }
        return zera;
    }

    public static int ileMaksymalnych(int[] tab) {
        int i = 0, counter = 0;
        int biggest = tab[0];
        while (i != tab.length) {
            if (tab[i] > biggest) {
                biggest = tab[i];
            }
            i++;
        }
        i = 0;
        while (i != tab.length) {
            if (tab[i] == biggest) {
                counter++;
            }
            i++;
        }
        return counter;
    }

    public static int sumaDodatnich(int[] tab) {
        int i = 0;
        int positiveSum = 0;
        while (i != tab.length) {
            if (tab[i] > 0) {
                positiveSum += tab[i];
            }
            i++;
        }
        return positiveSum;
    }

    public static int sumaUjemnych(int[] tab) {
        int i = 0;
        int negativeSum = 0;
        while (i != tab.length) {
            if (tab[i] < 0) {
                negativeSum += tab[i];
            }
            i++;
        }
        return negativeSum;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int[] tab) {
        int count1 = 0, count2 = 0, i = 0;
        while (i != tab.length) {
            if (tab[i] > 0)
                count1++;
            if (tab[i] < 0) {
                if (count1 < count2)
                    count1 = 0;
                else {
                    count2 = count1;
                    count1 = 0;
                }
            }
            i++;
        }
        return count2;
    }

    public static void signum(int[] tab) {
        int i = 0;
        while (i != tab.length) {
            if (tab[i] > 0) {
                tab[i] = 1;
            }
            if (tab[i] < 0)
                tab[i] = -1;
            i++;
        }
    }

    public static void odwrocFragment(int[] tab, int lewy, int prawy) {
        if (prawy < lewy) {
            int temp;
            temp = lewy;
            lewy = prawy;
            prawy = temp;
        }
        int temp;
        for (int i = 0; i <= tab.length - 1; i++) {
            for (int j = tab.length - 1; j >= 0; j--) {
                if (lewy - 1 >= prawy - 1)
                    break;
                if (i == lewy - 1 && j == prawy - 1) {
                    temp = tab[lewy - 1];
                    tab[lewy - 1] = tab[prawy - 1];
                    tab[prawy - 1] = temp;
                    lewy++;
                    prawy--;
                }
            }
        }
    }


    public static void main(String[] args) {
        int n = MojSkaner();
        while (!(1 <= n && n <= 100)) {
            System.out.println("N must be: 1 <= n <= 100");
            n = MojSkaner();
        }
        int[] tab = new int[n];
        generuj(tab, n, -999, 999);
        printTab(tab);
        System.out.println("Parzyste = " + ileParzystych(tab) + " nieparzyste = " + ileNieparzystych(tab));
        System.out.println("Dodatnie = " + ileDodatnich(tab) + " ujemne = " + ileUjemnych(tab) + " zera = " + ileZerowych(tab));
        System.out.println("Element max. występuje razy = " + ileMaksymalnych(tab));
        System.out.println("Suma dodatnich = " + sumaDodatnich(tab) + " suma ujemnych = " + sumaUjemnych(tab));
        System.out.println("Długosc najdłuzszego fragmentu tablicy, w którym wszystkie elementy sa dodatnie: " + dlugoscMaksymalnegoCiaguDodatnich(tab));
        signum(tab);
        printTab(tab);
        odwrocFragment(tab,1,5);
        printTab(tab);
    }
}

