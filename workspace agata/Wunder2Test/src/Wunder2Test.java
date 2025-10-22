package src;
import java.util.Scanner;


public class Wunder2Test {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println ("\n" + "Gib bitte eine Zahl an: \n");
  
    int Zahl = scanner.nextInt();
    scanner.close();
    
    if (Zahl == 1){
        System.out.println("\n" + "Keine Schritte");
    }else{
    int schritte = Wunder(Zahl, Zahl);
    System.out.println("\n" + "Anzahl der Schritte: " + schritte + "\n"); 
}  
}

public static int Wunder (int schritte, int Zahl) {
            for (int i = 0; Zahl != 1; i++){
                        if (Zahl % 2 == 0)
                            {Zahl = Zahl / 2;}
                        else 
                            {Zahl = (Zahl * 3) + 1;
                            } 
                        schritte = i + 1;  
}                        
                        return schritte;
                    
    
}
}







