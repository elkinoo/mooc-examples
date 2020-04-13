
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int alku = Integer.valueOf(lukija.nextLine());
        int loppu = Integer.valueOf(lukija.nextLine());

        kolmellaJaollisetValilta(alku, loppu);

    }

    public static void kolmellaJaollisetValilta(int alku, int loppu) {
        int luku = alku;

        while (true) {
            if (luku > loppu) {
                break;
            }

            if (luku % 3 == 0) {
                System.out.println(luku);
            }
            luku++;
        }
    }

}
