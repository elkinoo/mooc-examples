
import java.util.Scanner;

public class ToiseenPotenssiin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int luku = Integer.valueOf(lukija.nextLine());
        
        int tulos = luku * luku;
        
        System.out.println(tulos);

    }
}
