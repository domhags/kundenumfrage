import java.util.ArrayList;
import java.util.List;

public class Umfrage {
    private List<Integer> ergebnisse;
    private int anzahlNichtEmpfehlenswert;
    private int anzahlAkzeptabel;
    private int anzahlHervorragend;
    private double summe;

    public Umfrage() {
        this.ergebnisse = new ArrayList<>();
        this.anzahlNichtEmpfehlenswert = 0;
        this.anzahlAkzeptabel = 0;
        this.anzahlHervorragend = 0;
        this.summe = 0;
    }

    public void zufallsBewertungenGenerieren(int testpersonen) {
        for (int i = 0; i < testpersonen; i++) {
            int zufallszahl = (int) ((Math.random()) * 3 + 1);
            ergebnisse.add(zufallszahl);
        }
    }

    public void bewertungenAuswerten() {
        for (int bewertung : ergebnisse) {
            switch (bewertung) {
                case 1:
                    anzahlNichtEmpfehlenswert++;
                    break;
                case 2:
                    anzahlAkzeptabel++;
                    break;
                case 3:
                    anzahlHervorragend++;
                    break;
            }
            summe += bewertung;
        }
    }

    public void ergebnisseAusgeben(int testpersonen) {
        System.out.println("Gesamtbewertungen insgesamt: " + ergebnisse.size());
        System.out.println("nicht empfehlenswert: " + anzahlNichtEmpfehlenswert);
        System.out.println("akzeptabel: " + anzahlAkzeptabel);
        System.out.println("hervorragend: " + anzahlHervorragend);
        System.out.println("Prozentuale Verteilung:");
        System.out.println("Bewertung 1: " + berechneProzentsatz(anzahlNichtEmpfehlenswert, testpersonen) + "%");
        System.out.println("Bewertung 2: " + berechneProzentsatz(anzahlAkzeptabel, testpersonen) + "%");
        System.out.println("Bewertung 3: " + berechneProzentsatz(anzahlHervorragend, testpersonen) + "%");
        System.out.println("Durchschnittliche Gesamtbewertung: " + berechneDurchschnitt(testpersonen));
    }

    private double berechneProzentsatz(int anzahl, int testpersonen) {
        return (anzahl / (double) testpersonen) * 100;
    }

    private double berechneDurchschnitt(int testpersonen) {
        return summe / testpersonen;
    }
}
