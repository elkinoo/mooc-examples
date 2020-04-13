
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta luokkaa TelevisioOhjelma käyttävä ohjelmasi tänne

        ArrayList<TelevisioOhjelma> ohjelmat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        while (true) {
            System.out.print("Nimi: ");
            String nimi = lukija.nextLine();
            if (nimi.equals("")) {
                break;
            }
            System.out.print("Pituus: ");
            int pituus = Integer.valueOf(lukija.nextLine());
            TelevisioOhjelma ohjelma = new TelevisioOhjelma(nimi, pituus);
            ohjelmat.add(ohjelma);
        }

        System.out.print("Pituus: ");
        int maksimi = Integer.valueOf(lukija.nextLine());

        for (TelevisioOhjelma televisioOhjelma : ohjelmat) {
            if (televisioOhjelma.getPituus() <= maksimi) {
                System.out.println(televisioOhjelma);
            }
        }
    }
}
