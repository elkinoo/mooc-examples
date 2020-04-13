
import java.util.ArrayList;
import java.util.List;

public class Lukutilasto {

    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.summa = 0;
    }

    public void lisaaLuku(int luku) {
        this.lukujenMaara++;
        this.summa += luku;
    }

    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }

    public int summa() {
        return this.summa;
    }

    public double keskiarvo() {
        if (this.summa != 0) {
            return 1.0 * this.summa / this.lukujenMaara;
        }
        return 0;
    }
}
