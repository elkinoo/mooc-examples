
import java.util.Scanner;
import java.util.ArrayList;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;

        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            lista.add(luettu);
        }

        int vanhin = 0;

        for (int i = 0; i < lista.size(); i++) {
            String tyyppi = lista.get(i);
            int luku = Integer.valueOf(tyyppi.split(",")[1]);
            if (vanhin < luku) {
                vanhin = luku;
            }

        }

        System.out.println("Vanhimman ikä: " + vanhin);

    }
}
