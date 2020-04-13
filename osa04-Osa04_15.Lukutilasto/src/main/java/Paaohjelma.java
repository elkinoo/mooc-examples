
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna lukuja:");

        Lukutilasto kaikki = new Lukutilasto();
        Lukutilasto parilliset = new Lukutilasto();
        Lukutilasto parittomat = new Lukutilasto();

        while (true) {
            int value = Integer.valueOf(lukija.nextLine());
            if (value == -1) {
                break;
            }

            kaikki.lisaaLuku(value);
            if (value % 2 == 0) {
                parilliset.lisaaLuku(value);
            } else {
                parittomat.lisaaLuku(value);
            }
        }

        System.out.println("Summa: " + kaikki.summa());
        System.out.println("Parillisten summa: " + parilliset.summa());
        System.out.println("Parittomien summa: " + parittomat.summa());
    }
}
