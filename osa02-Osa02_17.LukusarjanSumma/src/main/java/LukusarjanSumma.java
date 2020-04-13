
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Mihin asti? ");
        int n = Integer.valueOf(lukija.nextLine());

        int summa = 0;
        int luku = 1;
        while (luku <= n) {
            summa += luku;
            luku++;
        }

        System.out.println("Summa on " + summa);
    }
}
