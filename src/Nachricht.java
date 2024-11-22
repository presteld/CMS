public class Nachricht extends Dokument{

    private String zielAdresse;

    public Nachricht(String autor, String titel, String zielAdresse) {
        super(autor, titel);
        this.zielAdresse = zielAdresse;
    }

    @Override
    public void ausgeben() {
        //super.ausgeben();
        //System.out.println("Das Dokument ist eine Nachricht an den Adressaten " + zielAdresse);

        System.out.println("Die Nachricht " + titel + " vom Autor " + autor + " wird an die Adresse " + zielAdresse + " gesendet");


    }
}
