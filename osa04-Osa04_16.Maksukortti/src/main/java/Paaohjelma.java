
public class Paaohjelma {

    public static void main(String[] args) {
        // Scanner lukija = new Scanner(System.in);
        Maksukortti pekanKortti = new Maksukortti(20);
        Maksukortti matinKortti = new Maksukortti(30);
        // Pekka syö maukkaasti
        pekanKortti.syoMaukkaasti();
        // Matti syö edullisesti
        matinKortti.syoEdullisesti();
        // Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
        // Pekka lataa rahaa 20 euroa
        pekanKortti.lataaRahaa(20.00);
        // Matti syö maukkaasti
        matinKortti.syoMaukkaasti();
        // Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);
        // Pekka syö edullisesti
        pekanKortti.syoEdullisesti();
        // Pekka syö edullisesti
        pekanKortti.syoEdullisesti();
        // Matti lataa rahaa 50 euroa
        matinKortti.lataaRahaa(50.00);
        // Korttien arvot tulostetaan (molemmat omalle rivilleen, rivin alkuun kortin omistajan nimi)
        System.out.println("Pekka: " + pekanKortti);
        System.out.println("Matti: " + matinKortti);

    }
}
