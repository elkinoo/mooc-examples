
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna luku: ");
        int n = Integer.valueOf(lukija.nextLine());
        int kertoma = 1;

        int luku = 1;
        while (luku <= n) {
            kertoma *= luku;
            luku++;
        }

        System.out.println("Kertoma on " + kertoma);
    }
}
