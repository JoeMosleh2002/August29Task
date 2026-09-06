import java.util.HashSet;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


  //  @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&Objects.equals(name, person.name);    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);

    }

    @Override
    public String toString(){
        return "ID : " + this.id +" Name : " + this.name;
    }
}









public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1996, "Rhea Ripley");
        Person person2 = new Person(1996, "Rhea Ripley");

        Person person3 = new Person(2002, "Sadie Sink");
        Person person4 = new Person(2002, "Inde Naverrete");


        // Before Overriding equals(): Compares references so it will return false and will return diffrent hashcodes

        System.out.println(person1.equals(person2));
        System.out.println(person3.equals(person4));


        Set<Person> wweRoster = new HashSet<>();
        // override by ID only : Size will only be 5
        wweRoster.add(new Person(1, "Roman Reigns"));         // 1. Unique ID 1
        wweRoster.add(new Person(1, "The Tribal Chief"));      // 2. Duplicate ID 1 -> REJECTED
        wweRoster.add(new Person(2, "Cody Rhodes"));         // 3. Unique ID 2
        wweRoster.add(new Person(2, "Seth Rollins"));        // 4. Unique ID 3
        wweRoster.add(new Person(3, "CM Punk"));             // 5. Unique ID 4
        wweRoster.add(new Person(3, "The American Nightmare"));// 6. Duplicate ID 2 -> REJECTED
        wweRoster.add(new Person(4, "Randy Orton"));         // 7. Unique ID 5
        wweRoster.add(new Person(4, "Rhea Ripley"));         // 8. Unique ID 6
        wweRoster.add(new Person(5, "Drew McIntyre"));       // 9. Unique ID 7
        wweRoster.add(new Person(5, "Gunther"));             // 10. Unique ID 8





        System.out.println("Size of set : " + wweRoster.size()); //
        System.out.println("---------------------------------------------------");
        wweRoster.clear();
//  By Names : Size will be 5
        wweRoster.add(new Person(1, "Roman Reigns"));
        wweRoster.add(new Person(2, "Roman Reigns"));
        wweRoster.add(new Person(3, "Cody Rhodes"));
        wweRoster.add(new Person(4, "Cody Rhodes"));
        wweRoster.add(new Person(5, "CM Punk"));
        wweRoster.add(new Person(6, "CM Punk"));
        wweRoster.add(new Person(7, "Rhea Ripley"));
        wweRoster.add(new Person(8, "Rhea Ripley"));
        wweRoster.add(new Person(9, "Gunther"));
        wweRoster.add(new Person(10, "Gunther"));


        System.out.println("Size of set : " + wweRoster.size()); //
        System.out.println("---------------------------------------------------");
        wweRoster.clear();



// name and id: this case size will be 10;
        wweRoster.add(new Person(1, "Roman Reigns"));
        wweRoster.add(new Person(2, "Roman Reigns"));
        wweRoster.add(new Person(3, "Cody Rhodes"));
        wweRoster.add(new Person(4, "Cody Rhodes"));
        wweRoster.add(new Person(5, "CM Punk"));
        wweRoster.add(new Person(6, "CM Punk"));
        wweRoster.add(new Person(7, "Rhea Ripley"));
        wweRoster.add(new Person(8, "Rhea Ripley"));
        wweRoster.add(new Person(9, "Gunther"));
        wweRoster.add(new Person(10, "Gunther"));


        System.out.println("Size of set : " + wweRoster.size()); //
        System.out.println("---------------------------------------------------");
        wweRoster.clear();

    // HashMap Example:

        HashMap<Person,String> roles = new HashMap<>();

        Person p1 = new Person(1,"Rhea");
        Person p2 = new Person(2,"Sadie");

    // when key is the same
        roles.put(p1,"Manager");
        roles.put(p1,"Engineer");
        roles.put(p2,"Sales ");

        System.out.println("Size:" + roles.size()); // size is 2, dupliactes are not adde

        Person p3 = new Person(1,"Alexa");
        roles.put(p3,"Senior Manager");
        System.out.println("Size" + roles.size()); // still 2
        System.out.println(" Value for ID1" + roles.get(p1)); // Senior Manager



    }





}