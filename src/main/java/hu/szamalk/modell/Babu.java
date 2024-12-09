package hu.szamalk.modell;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin, int ero) {
        this.szin = szin;
        if (ero < 1) ero = 1;
        else if (ero > 9) ero = 9;
        this.ero = ero;
    }

    public Babu(String szin) {
        this(szin, 1);
    }
}
