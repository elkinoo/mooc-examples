
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int maara = 0;
        
        while (true) {
            
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());

            if (luku == 0) {
                break;
            }

            maara = maara + 1;

        }
        
        System.out.println("Lukuja yhteensä " +maara);
    }
}
