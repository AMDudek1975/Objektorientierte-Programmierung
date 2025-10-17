package src;
import java.util.Scanner;

public class Eingabe {
    public static void main(String[] args) {
        
  Scanner scanner = new Scanner(System.in);
  System.out.println ("Gib bitte ein Tier an: ");
  
  String Tier = scanner.next();

   scanner.close();
  
  System.out.println(Tier);
}
}

