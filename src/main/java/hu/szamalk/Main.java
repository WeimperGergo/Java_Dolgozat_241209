package hu.szamalk;


import hu.szamalk.modell.Tabla;

import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Tabla T1 = new Tabla('#');
        // f4
        System.out.println("4. feladat: Az üres tábla: ");
        T1.megjelenit();
        // f5-6
        System.out.println("6. feladat: A feltöltött tábla: ");
        T1.elhelyez(8);
        T1.megjelenit();
        // f7
        //System.out.println(T1.uresSor(2));
        //System.out.println(T1.uresOszlop(7));
        // f8-9
        System.out.println("\n9. feladat: \nOszlopok: " + T1.uresOszlopSzama());
        System.out.println("Sorok: " + T1.uresSorSzama());


    }
}