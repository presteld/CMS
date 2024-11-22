public class Dokument {

    protected String titel;
    protected String autor;


    public Dokument(String autor, String titel) {
        this.autor = autor;
        this.titel = titel;
    }

public void ausgeben(){     // bibt den Zustand des Dokuments aus
        System.out.println("Das Dokument " + titel + " hat den Autor " + autor)
;}


}
