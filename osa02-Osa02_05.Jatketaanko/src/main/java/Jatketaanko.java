
import java.util.Scanner;

public class Jatketaanko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.println("Jatketaanko?");
            String eka = lukija.nextLine();
            if (eka.equals("ei")) {
                break;
            }

        }
    }
}
