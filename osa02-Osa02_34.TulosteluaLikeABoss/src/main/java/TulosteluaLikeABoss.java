
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        int tulostettu = 0;
        while (tulostettu < maara) {
            System.out.print("*");
            tulostettu = tulostettu + 1;
        }
        System.out.println("");

    }

    public static void tulostaTyhjaa(int maara) {
        int tulostettu = 0;
        while (tulostettu < maara) {
            System.out.print(" ");
            tulostettu = tulostettu + 1;
        }
    }

    public static void tulostaKolmio(int koko) {
        int i = 1;
        while (i <= koko) {
            tulostaTyhjaa(koko - i);
            tulostaTahtia(i);
            i++;
        }
    }

    public static void jouluKuusi(int korkeus) {
        int i = 1;
        while (i <= korkeus) {
            int vali = (korkeus + (korkeus - 1) - (i + i - 1)) / 2;
            tulostaTyhjaa(vali);
            tulostaTahtia(i + i - 1);
            i++;
        }
        // Jalka
        int x = 1;
        while (x <= 2) {
            int jalka = (korkeus + (korkeus - 1) - 3) / 2;
            tulostaTyhjaa(jalka);
            tulostaTahtia(3);
            x++;
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
