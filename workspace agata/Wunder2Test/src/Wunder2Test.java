import java.util.Scanner;


public class Wunder2Test {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println ("\n" + "Gib bitte eine Zahl an: \n");
  
    int Zahl = scanner.nextInt();

    scanner.close();
    
    for(int schritte = 0; Zahl != 1;schritte++) {
    while(Zahl != 1){
        Wunder wunder = new Wunder();
        Zahl = wunder.wunder(Zahl);
        schritte++;
    }
    System.out.println("\n" + "Anzahl der Schritte: " + schritte + "\n");
    }
}
}
class Wunder{
   int wunder(int Zahl){

    if (Zahl % 2 == 0) {
    Zahl = Zahl/2;
   }else {
    Zahl = Zahl * 3  + 1;
   }
return Zahl;
}
}
