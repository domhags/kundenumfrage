import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Herzlich Willkommen zur Kundenumfrage!");
        System.out.println("Bitte geben Sie die Anzahl der Testpersonen als Ganzzahl ein:");
        int testpersonen = scanner.nextInt();

        Umfrage umfrage = new Umfrage();
        umfrage.zufallsBewertungenGenerieren(testpersonen);
        umfrage.bewertungenAuswerten();
        umfrage.ergebnisseAusgeben(testpersonen);
    }
}