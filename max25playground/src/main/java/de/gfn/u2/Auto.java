package de.gfn.u2;

public class Auto {

    private static int anzahl;

    private String kennzeichen;
    private String marke;
    private String modell;
    private int kilometerstand;
    private int nr;

    public Auto(String kennzeichen, String marke, String modell) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        nr = ++anzahl;
    }

    public void fahre50Km() {
        kilometerstand += 50;
    }

    public void fahreKm(int km) {
        if (km >= 0)
            kilometerstand += km;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "kennzeichen='" + kennzeichen + '\'' +
                ", marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", kilometerstand=" + kilometerstand +
                ", nr=" + nr +
                '}';
    }
}
