
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku = Integer.valueOf(lukija.nextLine());
        tulostaLukuunAsti(luku);
    }

    public static void tulostaLukuunAsti(int luku) {
        int alku = 1;

        while (alku <= luku) {
            System.out.println(alku);
            alku++;
        }

    }

}
