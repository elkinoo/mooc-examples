
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.println("Syötä luku");
            int eka = Integer.valueOf(lukija.nextLine());
            if (eka == 4) {
                break;
            }

        }
    }
}
