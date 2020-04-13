
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String mjono = lukija.nextLine();
            String[] palat = mjono.split(" ");
            if (!mjono.equals("")) {
                for (int i = 0; i < palat.length; i++) {
                    System.out.println(palat[i]);
                }
            } else {
                break;
            }

        }

    }
}
