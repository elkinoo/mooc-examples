
import java.util.ArrayList;
import java.util.Scanner;

public class PoistaViimeinen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> mjonot = new ArrayList<>();

        while (true) {
            String jono = lukija.nextLine();
            if (jono.equals("")) {
                break;
            }

            mjonot.add(jono);

        }

        poistaViimeinen(mjonot);
    }

    public static void poistaViimeinen(ArrayList<String> mjonot) {
        if (mjonot.size() == 0) {
        } else {
            int viimeinen = mjonot.size() - 1;
            mjonot.remove(viimeinen);
            System.out.println(mjonot);
        }
    }

}
