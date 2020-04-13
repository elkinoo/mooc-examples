
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Mikä tulostetaan?");
        String mjono = lukija.nextLine();
        String kolmesti = mjono + mjono + mjono;

        System.out.println(kolmesti);
    }
}
