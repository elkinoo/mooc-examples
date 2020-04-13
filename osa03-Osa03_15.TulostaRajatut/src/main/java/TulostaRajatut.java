
import java.util.ArrayList;
import java.util.Scanner;

public class TulostaRajatut {

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
        
        int alku = Integer.valueOf(lukija.nextLine());
        int loppu = Integer.valueOf(lukija.nextLine());
        
        System.out.println("Luvut välillä "+ alku + loppu);
        tulostaRajatutLuvut(luvut,alku,loppu);
    }

    public static void tulostaRajatutLuvut(ArrayList<Integer> luvut, int alku, int loppu) {

        for (Integer jojouououu : luvut) {
            if (jojouououu >= alku && jojouououu <= loppu){
                System.out.println(jojouououu);
            }
        }
            
        }
    
  
    }

