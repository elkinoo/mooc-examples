
public class Tulostin {

    public static void main(String[] args) {
        // Tässä voit testata metodia
        int[] taulukko = {5, 1, 3, 4, 2};
        tulostaTaulukkoTahtina(taulukko);
    }

    public static void tulostaTaulukkoTahtina(int[] taulukko) {
        for (int tahtia : taulukko) {
            tulostaTahtia(tahtia);
            System.out.println();
        }
    }

    public static void tulostaTahtia(int montako) {
        while (montako > 0) {
            System.out.print("*");
            montako = montako - 1;
        }
    }

}
