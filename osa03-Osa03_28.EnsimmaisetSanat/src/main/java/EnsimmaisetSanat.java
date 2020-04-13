
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String mjono = lukija.nextLine();
            if (mjono.equals("")) {
                break;
            }
            String[] palat = mjono.split(" ");
            System.out.println(palat[0]);
        }
    }
}
