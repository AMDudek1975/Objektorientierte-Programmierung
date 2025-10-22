import java.util.Scanner;

public class Eingabe {
    public static void main(String[] args) {
        
  Scanner scanner= new Scanner(System.in);
  System.out.println ("Gib bitte zwei Zahlen an.");
  
  int x = scanner.nextInt();
  int y = scanner.nextInt();
  int ergebnis = x + y;
  
  scanner.close();
  
  System.out.println(ergebnis);
}
}

