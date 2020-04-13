
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        double positiivisetLukumaara = 0;
        double kaikkienLukumaara = 0;
        while (true) {
            Double luku = Double.valueOf(lukija.nextLine());

            if (luku == 0) {
                break;
            } else if (luku > 0) {
                positiivisetLukumaara = positiivisetLukumaara + luku;
                kaikkienLukumaara = kaikkienLukumaara + 1;
            }
        }

        if (kaikkienLukumaara == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");

        }
        System.out.println(1.0 * (positiivisetLukumaara / kaikkienLukumaara));
    }

}
