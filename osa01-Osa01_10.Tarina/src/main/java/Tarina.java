
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.\nMinkä niminen tarinassa esiintyvä hahmo on?");
        String hahmo = lukija.nextLine();
        
        System.out.println("Mikä hahmon ammatti on?");
        String ammatti = lukija.nextLine();
        
        System.out.println("Tässä tarina:\nOlipa kerran "+hahmo+", joka oli ammatiltaan "+ammatti+".");
        System.out.println("Matkatessaan töihin, "+hahmo+" mietti arkeaan.");
        System.out.println("Ehkäpä "+hahmo+" ei olekaan koko elämäänsä "+ammatti+".");
    }
}
