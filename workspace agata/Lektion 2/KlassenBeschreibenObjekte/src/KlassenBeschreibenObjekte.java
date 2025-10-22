package KlassenBeschreibenObjekte.src;
class Person{
    String firstName;
    String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getLastName(){
        return this.lastName;

    }

    String getFirstName(){
        return this.firstName;
    }        
}
public class KlassenBeschreibenObjekte {

    public static void main(String[] args) {
        Person p1 = new Person("Max", "Muster");
        Person p2 = new Person("Eva", "Beispiel");
    System.out.println(p1.getLastName() + " " + p1.getFirstName());
    System.out.println(p2.getLastName() + " " + p2.getFirstName());
    }
}
