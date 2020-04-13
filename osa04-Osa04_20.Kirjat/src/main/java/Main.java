
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            System.out.print("Sivuja: ");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.print("Kirjoitusvuosi: ");
            int vuosi = Integer.valueOf(lukija.nextLine());
            Kirja kirja = new Kirja(nimi, sivuja, vuosi);
            kirjat.add(kirja);
        }

        System.out.print("Mitä tulostetaan? ");
        String mita = lukija.nextLine();

        for (Kirja kirja : kirjat) {
            kirja.tulosta(mita);
        }
    }
}
