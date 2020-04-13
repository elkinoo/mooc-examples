
import java.util.Scanner;

public class Jakolasku {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int osoittaja = Integer.valueOf(lukija.nextLine());
        int nimittaja = Integer.valueOf(lukija.nextLine());
        // sen toimintaa täällä. Esimerkiksi kutsun jakolasku(3,5);
        // pitäisi tulostaa "0.6"
        jakolasku(osoittaja, nimittaja);
        // jakolasku(3, 5);
    }

    public static void jakolasku(int osoittaja, int nimittaja) {
        System.out.println(1.0 * osoittaja / nimittaja);

    }
}//

