
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());

        int amount = 0;
        try (Scanner reader = new Scanner(new File(tiedosto))) {

            while (reader.hasNextLine()) {
                int value = Integer.valueOf(reader.nextLine());
                if (value >= alaraja && value <= ylaraja) {
                    amount++;
                }
            }
        } catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto + " lukeminen epäonnistui.");
        }

        System.out.println("Lukuja: " + amount);

    }

}
