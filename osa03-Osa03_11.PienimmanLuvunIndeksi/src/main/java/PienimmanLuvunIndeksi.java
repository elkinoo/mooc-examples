
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == 9999) {
                break;
            }

            lista.add(luettu);
        }

        int pienin = lista.get(0);

        for (int i = 0; i < lista.size(); i++) {
            int luku = lista.get(i);
            if (pienin > luku) {
                pienin = luku;
            }

            ArrayList<Integer> indeksit = new ArrayList<>();

            int indeksi = lista.size() - 1;
            while (indeksi >= 0) {
                int numero = lista.get(indeksi);

                if (numero == luku) {
                    indeksit.add(indeksi);
                }
                indeksi = indeksi - 1;
            }

            System.out.println("Pienin luku on " + pienin);

            for (Integer index : indeksit) {
                System.out.println("Luku " + luku + " on indeksissä " + index);

            }
        }
    }
}
