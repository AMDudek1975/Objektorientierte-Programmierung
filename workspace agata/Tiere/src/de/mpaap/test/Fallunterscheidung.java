
package de.mpaap.test;
import java.util.Scanner;
public class Fallunterscheidung {
     public static void main (String[] args){
{
      Scanner scanner = new Scanner(System.in);
  System.out.println ("Gib bitte ein Tier an: ");
  
  String tier = scanner.next();
     scanner.close();
        
    
     if (tier. equals("Spinne")) {
         
       System.out.println("\n" + tier + "\n" + "8 Beine \n"   + "flugfähig: ja \n" +  "hat Federn. ja \n" + "gefährlich für Menschen: eventuell \n");
       
     } else {
         if (tier. equals("Löwe")) {
     
                 System.out.println("\n" + tier + "\n" + "4 Beine \n" + "flugfähig: nein \n" + "hat Federn: nein \n" + "gefährlich für Menschen: sehr wahrscheinlich \n");
         
     } else {
         if (tier. equals("Adler")) {
             
                 System.out.println("\n" + tier + "2 Beine \n" + "flugfähig: ja \n" + "hat Federn: ja \n" + "gefährlich für Menschen: nein \n");
     
     } else {
         if (tier. equals("Murmeltier")) {
     
                 System.out.println("\n" + tier + "\n" + "4 Beine \n" + "flugfähig: nein \n" + "hat Federn: nein \n" + "gefährlich für Menschen: nein \n");
         
     } else {
         if (tier. equals("Schwalbe")) {
             
                 System.out.println("\n" + tier + "\n" + "2 Beine \n" + "flugfähig: ja \n" + "hat Federn: ja \n" + "gefährlich für Menschen: nein \n");
     } else {
         if (tier. equals("Krokodil")) {
         
                 System.out.println("\n" + tier + "\n" + "4 Beine \n" + "flugfähig: nein \n" + "hat Federn: nein \n" + "gefährlich für Menschen: sehr wahrscheinlich \n");
             
     } else {
         if (tier. equals("Schlange")) {
                 
                 System.out.println("\n" + tier + "\n" + "keine Beine \n" + "flugfähig: nein \n" + "hat Federn: nein \n" + "gefährlich für Menschen: möglich \n");
         
     } else {
         if (tier. equals("Kollibri")) {
         
                 System.out.println("\n" + tier + "\n" +"2 Beine \n" + "flugfähig: ja \n" + "hat Federn: ja \n" + "gefährlich für Menschen: nein \n");
             
     } else {
         if (tier. equals("Reh")) {
                 
                 System.out.println("\n" + tier + "\n" + "4 Beine \n" + "flugfähig: nein \n" + "hat Federn: nein \n" + "gefährlich für Menschen: nein \n");            
     }else {
         if (tier. equals("Wolf")) {
        
                 System.out.println("\n" + tier + "\n" + "4 Beine \n" + "flugfähig: nein \n" + "hat Federn: nein \n" + "gefährlich für Menschen: möglich \n"); 
     }else {
             
                 System.out.println("\n" + "Tier nicht in der Datenbank \n");
     }
        }
        }
        }
        }
        }
        }
        }
        }
     }
    }
}
}
