
import java.util.ArrayList;
import java.util.Scanner;

public class ListanViimeinenArvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int maara = 0;

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            maara++;
            lista.add(luettu);
        }
        
        System.out.println(lista.get(lista.size()-1));
    }
}
