public class Test {

    static final String POLE_KLASY_MAIN = "Sam static value";
    String poleObiektu = "Pole obiektu";

    static String staticTakie (String[] takie){
        return takie[0];

    }
    static String returnFirstElementFromTable(String [] table)
    {return table[0];}

    public static void main(String[] args) {



        String[] s = {"A","B","C"};
        args = s;

        Person[] people = {new Person("Ala", "Kowalska", 958482158),
                new Person("","Nowak", 458218481),
                null,
                new Person("Piotr", "", null)};

        for(Person person : people){
            System.out.println(person.pesel);
        }
    }

}

class Person{

    String name;
    String LastName;
    Integer pesel;

    public Person(String name, String LastName, Integer pesel){

        this.name = name;
        this.LastName = LastName;
        this.pesel = pesel;
    }
}