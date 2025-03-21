import java.util.Scanner;

public class dozierender {
    Scanner sc = new Scanner (System.in);

        String name;
        String Fakultaet;
        int bueronummer;

        public String frageBeantworten(){
            System.out.println("Beantworten Sie die Frage");
            String antwort = sc.nextLine();
            return antwort;

        }
    }
