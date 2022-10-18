public class Konfigurationstest {
    public static void main(String[] args) {
        int cent = 70;
        cent = 80;
        double maximum = 95.90;
        boolean a = true;
        short b = -1000;
        float c = 1.255f;
        char d = '#';
        byte e = 8;
        long f = 2147483648l;
        String g = "Ich hasse Wiederholungen";
        final int check_nr = 8765;

        //Speicherplatz zu verringern und Kompilierzeit so schnell wie möglich zu halten

        int ergebnis = 4 + 8 * 9 - 1;
        System.out.println(ergebnis);
        int zaehler = 1;
        zaehler++;
        System.out.println(zaehler);
        int ergebnis2 = 22/6;
        System.out.println(ergebnis2);

        /*
        && UND AND
        false false -> false
        false true -> false
        true false -> false
        true true -> true

        II ODER OR
        false false -> false
        false true -> true
        true false -> true
        true true -> true
         */

        int schalter = 10;
        System.out.println(schalter>=7 && schalter<=12);
        System.out.println(schalter!=10);
        System.out.println(schalter==12);

        String zeichenkette = "Meine Oma " + "fährt im " + "Hühnerstall Motorrad";
        System.out.println(zeichenkette);


    }
}
