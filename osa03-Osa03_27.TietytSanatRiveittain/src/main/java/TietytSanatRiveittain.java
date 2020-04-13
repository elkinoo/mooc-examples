
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        while (true) {
            String mjono = lukija.nextLine();
            if (mjono.equals("") ) {
                break;
            }
            String[] palat = mjono.split(" ");
            for (String pala : palat) {
                if (pala.contains("av")){
                    System.out.println(pala);
                }
            }
        }
    }
}
