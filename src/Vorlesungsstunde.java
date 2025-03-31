public class Vorlesungsstunde {



    private String Thema;
    private Date Datum;
    private int Uhrzeit;
    private String Raum;

       public Vorlesungsstunde(String Thema, Date Datum, int Uhrzeit, String Raum) {
        this.Thema = Thema;
        this.Datum = Datum;
        this.Uhrzeit = Uhrzeit;
        this.Raum = Raum;
       }

       public void detailsVorlesung(){
        System.out.println("Thema: " + this.Thema);
        System.out.println("Datum: " + this.Datum);
        System.out.println("Uhrzeit: " + this.Uhrzeit);
        System.out.println("Raum: " + this.Raum);
       }







                }
