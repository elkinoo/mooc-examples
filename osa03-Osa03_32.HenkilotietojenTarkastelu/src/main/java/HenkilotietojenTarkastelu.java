
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            lista.add(luettu);
        }
        
        int keskivuos = 0;
        String nimi = "";

        for (int i = 0; i < lista.size(); i++) {
            String tyyppi = lista.get(i);
            String uunim = (tyyppi.split(",")[0]);
            int luku = Integer.valueOf(tyyppi.split(",")[1]);
            keskivuos += luku;
            if (nimi.length() < uunim.length()) {
                nimi = uunim;
            }

        }

        System.out.println("Pisin nimi: " + nimi);
        System.out.println("Syntymävuosien keskiarvo: " + ((double)keskivuos /lista.size()));

    }
}
