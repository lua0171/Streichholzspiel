public class Lehrveranstaltung {

        private String Titel;
        private String Dozierende;
        private String[] Teilnehmerliste;
        private static int Vorlesungsstunden;
        private int Praktikumsstunden;
        public int anzahlTeilnehmer;

        public Lehrveranstaltung(String Titel, String Dozierende, String[] Teilnehmerliste, int Vorlesungsstunden, int Praktikumsstunden, int anzahlTeilnehmer) {
                this.Titel = Titel;
                this.Dozierende = Dozierende;
                this.Teilnehmerliste = new String[100];
                this.Vorlesungsstunden = Vorlesungsstunden;
                this.Praktikumsstunden = Praktikumsstunden;
                this.anzahlTeilnehmer = anzahlTeilnehmer;
        }


        public void hinzufuegen(Studierender student) {
                if (anzahlTeilnehmer < Teilnehmerliste.length) {                                       // Noch Platz?
                        Teilnehmerliste[anzahlTeilnehmer] = student.getName();                         // Speichere den Studenten
                        System.out.println(student.getName() + " wurde hinzugefügt.");
                        anzahlTeilnehmer++;                                                            // Erhöhe die Teilnehmerzahl
                } else {
                        System.out.println("Teilnehmerliste ist voll");

                }
        }

        public void entfernen(Studierender student) {
                for (int i = 0; i < anzahlTeilnehmer; i++) {
                        if (Teilnehmerliste[i] != null && Teilnehmerliste[i].equals(student.getName())) {
                                Teilnehmerliste[i] = Teilnehmerliste[anzahlTeilnehmer - 1];           // Letzten Teilnehmer hierhin verschieben
                                Teilnehmerliste[anzahlTeilnehmer - 1] = null;                        // Letzten Eintrag löschen
                                anzahlTeilnehmer--;                                                  // Teilnehmerzahl verringern
                                System.out.println(student.getName() + " wurde entfernt.");
                                break;                                                                // Sobald gefunden, Abbruch der Schleife
                        }
                }



                public void hinzufuegenVorlesung() {
                        Vorlesungsstunden++;
                }

                public void deatilsVeranstaltung(String Titel) {
                        System.out.println("Titel: " + Titel + "Dozierende" + Dozierende + "Teilnehmerliste" + Teilnehmerliste + "Vorlesungsstunden" + Vorlesungsstunden + "Praktikumsstunden" + Praktikumsstunden + "anzahlTeilnehmer" + anzahlTeilnehmer);
                }









                //public void Details(Vorlesungstunde vorlesung){
                  //      System.out.println("Thema: " + vorlesung.getThema() + "Datum" + vorlesung.getDatum() + "Uhrzeit" + vorlesung.getUhrzeit() + "Raum" + vorlesung.getRaum());
                }
        }












