import java.math.BigDecimal;

public class Dodavka extends OsobniVozidlo implements Majetek {

    private BigDecimal cena;
    private int uzitecnaHmotnost;
    private int hmotnostNakladu;

    public Dodavka(int pocetSedadel, int uzitecnaHmotnost) {
        super(pocetSedadel);
        this.hmotnostNakladu = 0;
        this.uzitecnaHmotnost = uzitecnaHmotnost;
        this.cena = BigDecimal.ZERO;
    }

    public int getHmotnostNakladu() {
        return hmotnostNakladu;
    }

    public BigDecimal getCena() {return cena;}

    public void nalozNaklad(int hmotnostNakladaneho) throws VozidlaException {
        int celkem = hmotnostNakladaneho + hmotnostNakladu;
        if (celkem > uzitecnaHmotnost || celkem < 0){
            throw new VozidlaException ("Neplatný počet osob: aktuálně: " + hmotnostNakladu + " osob, " + "má nasednout: " + hmotnostNakladaneho + ", " + "sedadel: " + uzitecnaHmotnost + "!");
        }
        hmotnostNakladu += hmotnostNakladaneho;
    }
}
