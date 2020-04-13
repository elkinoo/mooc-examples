
import java.util.Scanner;

public class NollastaLukuun {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int loppu = Integer.valueOf(lukija.nextLine());
        
        for (int i = 0; i <= loppu; i++) {
            System.out.println(i);
        }

    }
}
