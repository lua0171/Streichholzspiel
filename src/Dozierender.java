import java.util.Scanner;

public class Dozierender {
    Scanner sc = new Scanner (System.in);

    private String name;
    private String fakultaet;
    private int bueronummer;

    public Dozierender(String name, String fakultaet, int bueronummer) {
        this.name = name;
        this.fakultaet = fakultaet;
        this.bueronummer = bueronummer;

    }
    public void setNameDoz(String name) {
        this.name = name;
    }
    public String getNameDoz() {
        return name;
    }

    //public void setFakultaet(String fakultaet) {
    //this.fakultaet = fakultaet;
    //}

    public String getFakultaet() {
        return fakultaet;
    }

    public void setBueroNummer(int bueroNummer) {
        this.bueronummer = bueroNummer;
    }
    public int getBueroNummer() {
        return bueronummer;
    }

    public void frageBekommen(Studierender student, String frage) {
        System.out.println("Frage von " + student.getName() + ": " + frage);

        }

    public String frageBeantworten(Studierender student) {
        System.out.println(name + ",beantworten Sie die Frage von " + student.getName() + ": ");
        String antwort = sc.nextLine();
        return System.out.println("Antwort von " + name + " an " + student.getName() + ": " + antwort);
    }



    private int insgesamt = 0; // Speichert die Summe aller Bewertungen
    private int anzahl = 0;
    private int bewertung = bewertung();

    public void feedback(int bewertung){
                System.out.println("Feedback:" + bewertung + "von 10 Sternen");
                int insgesamt += bewertung;
                int anzahl++;;
                int Schnitt = insgesamt/anzahl;
                System.out.println("Durchschnittliche Bewertung:" + Schnitt + "von 10 Sternen");

            }

        }







