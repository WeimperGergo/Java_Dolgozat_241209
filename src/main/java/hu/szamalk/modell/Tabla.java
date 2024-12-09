package hu.szamalk.modell;

public class Tabla {
    private Character[][] T;
    private Character UresCella;

    public Tabla(Character uresCella) {
        T = new Character[8][8];
        UresCella = uresCella;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                T[i][j] = UresCella;
            }
        }


    }
}
