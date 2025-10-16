public class Foo {
    public static void main (String [] args) {
        
        for (int i = 0; i <10; i = i + 2) {
            int x = 12;
            int y = 7;
            x = x < 0 ? x * -1 : x;                                         //wenn x negativ, mit -1 multiplizieren
            y = y < 0 ? y * -1 : y;                                         //wenn y negativ, mit -1 multiplizieren
            int ergebnis = x + y;                                          // die Zahle x und y addieren und als ergebnis speichern
            while (ergebnis  >= 3) {                                    //vom ergebnis so lange 3 subtrahieren bis ergebnis < 3 ist
                ergebnis = ergebnis - 3;
                System.out.println(ergebnis);
            }
            int paarNr = i / 2 + 1;                                        //neuer integer-wert
            switch (ergebnis) {                                           //
            case 0:
               System.out.println (paarNr + " . Paar: o");
            case 1:
                System.out.println (paarNr + " . Paar: 1");
            case 2:
                System.out.println (paarNr + " . Paar: 2");
            default:
                System.out.println ("Das kann nicht sein!");
                break;
                
            }
        }
    }
}
    