package src;
import java.util.Scanner;
public class Tiere2 {
    public static void main(String[] args) {
    Scanner Tier = new Scanner(System.in);
    System.out.println("Gib bitte ein Tier an: \n");
    String AngegebenesTier = Tier.next();
    Tier.close();
  
        Tiere[] Tiere = new Tiere[10];
        Tiere[0] = new Tiere("Löwe", "4 Beine", "Fell", "nicht flugfähig", "sehr gefährlich");
        Tiere[1] = new Tiere("Spinne", "8 Beine", "Chitinpanzer", "nicht flugfähig", "eventuell gefährlich");
        Tiere[2] = new Tiere("Adler", "2 Beine", "Federn", "flugfähig", "nicht gefährlich");
        Tiere[3] = new Tiere("Murmeltier", "4 Beine", "Fell", "nicht flugfähig", "nicht gefährlich");
        Tiere[4] = new Tiere("Schwalbe", "2 Beine", "Federn", "flugfähig", "nicht gefährlich");
        Tiere[5] = new Tiere("Krokodil", "4 Beine", "Schuppen", "nicht flugfähig", "sehr gefährlich");
        Tiere[6] = new Tiere("Schlange", "keine Beine", "Schuppen", "nicht flugfähig", "möglicherweise gefährlich");
        Tiere[7] = new Tiere("Kollibri", "2 Beine", "Federn", "flugfähig", "nicht gefährlich");
        Tiere[8] = new Tiere("Reh", "4 Beine", "Fell", "nicht flugfähig", "nicht gefährlich");
        Tiere[9] = new Tiere("Wolf", "4 Beine", "Fell", "nicht flugfähig", "möglicherweise gefährlich");
        
        for (int i = 0; i < 10; i++) {
        if(AngegebenesTier.equals(Tiere[i].getName())){
         Tiere[i].print();   
        }
    }

}
}

class Tiere {
    String Name;
    String Beine;
    String Art;
    String Flugfähigkeit;
    String Gefahrlichkeit;

    Tiere(String Name, String Beine, String Art, String Flugfähigkeit, String Gefahrlichkeit){
        this.Name = Name;
        this.Beine = Beine;
        this.Art = Art;
        this.Flugfähigkeit = Flugfähigkeit;
        this.Gefahrlichkeit = Gefahrlichkeit;
    }
    String getName(){
        return this.Name;

    }
    String getBeine(){
        return this.Beine;
    }
    String getArt(){
        return this.Art;
    }
    String getFlugfähigkeit(){
        return this.Flugfähigkeit;
    }
    String getGefahrlichkeit(){
        return this.Gefahrlichkeit;
    }

      void print (){
        System.out.println(this.Beine);
        System.out.println(this.Art);
        System.out.println(this.Flugfähigkeit);
        System.out.println(this.Gefahrlichkeit + "\n");

    }

}


    



