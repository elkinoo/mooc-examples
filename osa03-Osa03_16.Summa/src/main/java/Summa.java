
import java.util.ArrayList;
import java.util.Scanner;

public class Summa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }

        summa(luvut);
    }

    public static int summa(ArrayList<Integer> luvut) {

        int luku = 0;
        
        for (Integer uusi : luvut) {
            luku = luku + uusi;

        }
        return (luku);

    }

}
