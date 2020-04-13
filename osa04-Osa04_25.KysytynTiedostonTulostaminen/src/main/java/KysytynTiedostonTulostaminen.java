
import java.nio.file.Paths;
import java.io.File;
import java.util.Scanner;

public class KysytynTiedostonTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Minkä tiedoston sisältö tulostetaan?");
        String fileName = lukija.nextLine();

        try (Scanner reader = new Scanner(new File(fileName))) {

            while (reader.hasNextLine()) {

                String row = reader.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
    }
}
