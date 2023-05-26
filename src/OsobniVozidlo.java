public class OsobniVozidlo {

    private int pocetOsob;
    private int pocetSedadel;

    public OsobniVozidlo(int pocetSedadel) {
        this.pocetOsob = 0;
        this.pocetSedadel = pocetSedadel;
    }

    public int getPocetOsob() {
        return pocetOsob;
    }

    public void nasedlyOsoby(int pocetNovych) throws VozidlaException {
        int celkem = pocetOsob + pocetNovych;
        if (celkem > pocetSedadel || celkem <0){
            throw new VozidlaException ("Neplatný počet osob: aktuálně: " + pocetOsob + " osob, " + "má nasednout: " + pocetNovych + ", " + "sedadel: " + pocetSedadel + "!");
        }

        pocetOsob += pocetNovych;

    }

}
