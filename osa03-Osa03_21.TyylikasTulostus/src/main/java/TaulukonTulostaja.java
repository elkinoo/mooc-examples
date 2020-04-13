
public class TaulukonTulostaja {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTyylikkaasti(taulukko);
    }

    public static void tulostaTyylikkaasti(int[] taulukko) {
        int indeksi = 0;

        while (indeksi < taulukko.length) {
            if (indeksi + 1 == taulukko.length) {
                System.out.print(taulukko[indeksi]);
                break;
            }
            System.out.print(taulukko[indeksi] + " ,");

            indeksi++;
        }

    }
}
