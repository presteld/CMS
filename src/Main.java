public class Main {


    public static void main(String[] args) {

    Dokument bestellung = new Dokument("Hans Klein","Computerbestellung");
    bestellung.ausgeben();

    Nachricht einladung = new Nachricht("Elise","Einladung zur Besprechung","verteiler@hnu.de");
    einladung.ausgeben();

    Mitarbeiter m1 = new Mitarbeiter("Susanne Stolz");
    //m1.ausgeben();
    m1.setDok1(bestellung);
    m1.ausgeben();


    Mitarbeiter m2 = new Mitarbeiter("Franz Huber");
    m2.setNachricht1(einladung);
    m2.ausgeben();


    }
}