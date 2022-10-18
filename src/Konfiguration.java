public class Konfiguration {
    public static void main(String[] args) {
        final byte PRUEFNR = 4;
        int muenzenCent = 1280;
        int muenzenEuro = 130;
        int euro;
        int cent;
        int summe;
        String typ = "Automat AVR";
        String  bezeichnung = "Q2021_FAB_A";
        String name;
        char sprachModul = 'd';
        double maximum = 100.00;
        double patrone = 46.24;
        double prozent;
        boolean status;

        summe = muenzenCent + muenzenEuro * 100;
        euro = summe / 100;
        cent = summe % 100;
        name = typ + " " + bezeichnung;
        prozent = maximum - patrone;
        status = (euro <= 150)
                && (euro >= 50)
                && (cent != 0)
                && (sprachModul == 'd')
                && (prozent >= 50.00)
                &&  (!(PRUEFNR == 5 || PRUEFNR == 6));

        System.out.println("Name: " + name);
        System.out.println("Sprache: " + sprachModul);
        System.out.println("Prüfnummer : " + PRUEFNR);
        System.out.println("Füllstand Patrone: " + prozent + " %");
        System.out.println("Summe Euro: " + euro +  " Euro");
        System.out.println("Summe Rest: " + cent +  " Cent");
        System.out.println("Status: " + status);
    }
}
