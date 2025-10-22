
import java.util.Scanner;

public class WunderTest{
    public static void main(String[] args) {
        
  Scanner scanner = new Scanner(System.in);
  System.out.println ("\n" + "Gib bitte eine Zahl an: \n");
  
  int Zahl = scanner.nextInt();

   scanner.close();

   for(int i = 0; Zahl != 1; i++) {

   if (Zahl % 2 == 0) {
    Zahl = Zahl/2;
   }else{
    Zahl = Zahl * 3  + 1;
   }
   int schritte = i + 1;
  if (Zahl == 1)
   System.out.println("\n" + "Anzahl der Schritte: " + schritte + "\n");
}
}
}


   
