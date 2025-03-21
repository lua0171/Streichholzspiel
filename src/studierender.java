

public class studierender {
    String name;
    static int matrikelnummer=0;
    String studiengang;

    public studierender(String name, String studiengang){
        this.name = name;
        matrikelnummer++;
        this.studiengang = studiengang;
    }

    public void frageStellen(){
        System.out.println("Stellen Sie eine Frage");
        Input.readString();   
    }

    public String neueSprechstunde(){
        System.out.println("Geben Sie den Tag der Sprechstunde ein");
        int Tag = Input.readInt();
        String Monat = Input.readString();
        return Tag + "." + Monat;
    }


    
}

