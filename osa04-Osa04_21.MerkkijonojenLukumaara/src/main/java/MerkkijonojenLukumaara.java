
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int amount = 0;
        while (true) {
            String input = lukija.nextLine();
            if (input.equals("loppu")) {
                break;
            }

            amount++;
        }

        System.out.println(amount);
    }
}
