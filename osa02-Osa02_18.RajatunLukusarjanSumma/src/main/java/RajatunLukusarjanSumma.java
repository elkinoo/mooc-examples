
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Ensimmäinen:");
        int a = Integer.valueOf(lukija.nextLine());
        
        System.out.print("Viimeinen:");
        int n = Integer.valueOf(lukija.nextLine());
        

        int summa = 0;
        while (a <= n) {
            summa += a;
            a++;
        }

        System.out.println("Summa on " + summa);
    }
}

    

