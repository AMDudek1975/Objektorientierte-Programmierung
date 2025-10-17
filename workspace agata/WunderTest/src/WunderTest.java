
import java.util.Scanner;

public class WunderTest{
    public static void main(String[] args) {
        
  Scanner scanner = new Scanner(System.in);
  System.out.println ("\n" + "Gib bitte eine Zahl an: \n");
  
  int Zahl = scanner.nextInt();

   scanner.close();

   for(int schritte = 0; Zahl != 1; schritte++) {
   while(Zahl != 1){
   if (Zahl % 2 == 0) {
    Zahl = Zahl/2;
   }else {
    Zahl = Zahl * 3  + 1;
   }
   schritte++;
  }
   System.out.println("\n" + "Anzahl der Schritte: " + schritte + "\n");
}
    }
  }


   
