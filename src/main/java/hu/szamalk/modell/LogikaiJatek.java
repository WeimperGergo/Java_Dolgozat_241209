package hu.szamalk.modell;

import java.util.Arrays;

public class LogikaiJatek extends Jatek{
    private Babu[][] tabla;
    private int[] sorrend;
    private int babuDb;

    public LogikaiJatek(int babuDb) {
        if (babuDb < 2) babuDb = 2;
        else if (babuDb > 15) babuDb = 15;

        this.tabla = new Babu[4][5];
        this.sorrend = new int[10];
        this.babuDb = babuDb;
    }

    public LogikaiJatek(){
        this(3);
    }

    public boolean van8FelettEro(){ return false; }

    @Override
    public void kezd(){ System.out.println("Kezdés"); }
    @Override
    public void ment(){ System.out.println("Mentés"); }
    @Override
    public void vege(){ System.out.println("Vége"); }

    @Override
    public String toString() {
        return "LogikaiJatek{ \nBábuk száma: " + babuDb + "}";
    }
}
