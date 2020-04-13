
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int alku = Integer.valueOf(lukija.nextLine());

        for (int i = alku; i <= 100; i++) {
            System.out.println(i);
        }

    }
}
