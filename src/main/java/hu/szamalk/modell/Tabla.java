package hu.szamalk.modell;

import java.util.Random;

public class Tabla {
    private Character[][] t;
    private Character uresCella;
    private static Random rnd = new Random();

    public Tabla(Character uresCella) {
        t = new Character[8][8];
        this.uresCella = uresCella;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = this.uresCella;
            }
        }
    }

    public void megjelenit(){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void elhelyez(int n){
        int i = 0;
        while (i < n) {
            int x, y;
            x = rnd.nextInt(0, 8);
            y = rnd.nextInt(0, 8);
            if (t[x][y] == uresCella){
                t[x][y] = 'K';
                i++;
            }
        }
    }

    public boolean uresOszlop(int y){
        int i = 0;
        boolean igaz = true;
        while (i < t.length) {
            if (t[i][y] == uresCella){
                i++;
            }
            else {
                igaz = false;
                i = t.length;
            }
        }
        return igaz;
    }

    public boolean uresSor(int x){
        int i = 0;
        boolean igaz = true;
        while (i < t[x].length) {
            if (t[x][i] == uresCella){
                i++;
            }
            else {
                igaz = false;
                i = t[x].length;
            }
        }
        return igaz;
    }

    public int uresSorSzama(){
        int ossz = 0;
        for (int i = 0; i < t.length; i++) {
            if (uresSor(i)) ossz++;
        }
        return ossz;
    }

    public int uresOszlopSzama(){
        int ossz = 0;
        for (int i = 0; i < t.length; i++) {
            if (uresOszlop(i)) ossz++;
        }
        return ossz;
    }





}
