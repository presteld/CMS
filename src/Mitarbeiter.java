public class Mitarbeiter {

    private String name;
    private Dokument dok1;
    private Nachricht nachricht1;

    public Mitarbeiter(String name) {
        this.name = name;
    }

    public void setDok1(Dokument dok1) {
        this.dok1 = dok1;
    }


    public void setNachricht1(Nachricht nachricht1) {
        this.nachricht1 = nachricht1;
    }

    public void ausgeben(){
        System.out.println("Name des verwaltenden Mitarbeiters: " + name);

        if(dok1 != null) {    // ist die zeigeradresse ungleich null
            System.out.println("Zu verantwortendes Dokument: ");
            dok1.ausgeben();
        }

        if(nachricht1 != null){
            System.out.println("Zu verwaltende Nachricht: ");
            nachricht1.ausgeben();
        }


}

}
