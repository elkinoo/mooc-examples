
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
         ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }
        int summa = 0;
        int maara = 0;

        for (int i = 0; i < lista.size(); i++) {
            int luettu = lista.get(i);
            summa = summa + luettu;
            maara++;
        }

        System.out.println("Keskiarvo: " + (summa / (double) maara));


       
    }
}
