
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("Mitä etsitään?");
        int luku = Integer.valueOf(lukija.nextLine());
        ArrayList<Integer> kakkat = new ArrayList<>();

        int indeksi = lista.size() - 1;
        while (indeksi >= 0) {
            int numero = lista.get(indeksi);

            if (numero == luku) {
                kakkat.add(indeksi);
            }
            indeksi = indeksi - 1;
        }

        System.out.println("Luku " + luku + " on indeksissä " + indeksi);
    }

    // toteuta tänne toiminnallisuus luvun etsimiseen
}
