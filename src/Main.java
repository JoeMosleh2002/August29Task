import java.util.*;


class Student {
    private int id;
    private String email;

    public Student(String email, int id) {
        this.email = email;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o){
        if (o == null | getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;

    }

    @Override

    public int hashCode(){
        return Objects.hash(id);
    }


//    @Override
//    public boolean equals(Object o){
//        if (o == null | getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(email,student.email);
//
//    }
//
//    @Override
//
//    public int hashCode(){
//        return Objects.hash(email);
//    }
//




}


class Product {
    private int code;
    private double price;

    public Product(int code, double price) {
        this.code = code;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o){
        if (o==null | getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return code == product.code;



    }


    @Override
    public int hashCode(){
        return Objects.hash(code);
    }


        }






class Car {
    private String plateNumber;
    private String color;

    public Car(String plateNumber, String color) {
        this.plateNumber =plateNumber;
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null | getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Objects.equals(plateNumber,car.plateNumber);

    }

    @Override
    public int hashCode() {
        return Objects.hash(plateNumber);
    }
}


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
        return id == person.id;    }

    @Override
    public int hashCode() {
        return Objects.hash(id);

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

    //  When checking using ID only and key is the same
        roles.put(p1,"Manager");
        roles.put(p1,"Engineer");
        roles.put(p2,"Sales ");

        System.out.println("Size:" + roles.size()); // size is 2, duplicates are not added
        System.out.println("------------------------------------------------------------------------");
        Person p3 = new Person(1,"Alexa");
        roles.put(p3,"Senior Manager");
        System.out.println("Size" + roles.size()); // still 2
        System.out.println(" Value for ID1" + roles.get(p1)); // Senior Manager

        Person query = new Person(2,"Ren Amamiya");
        System.out.println(" Value of ID 2 after change : " + roles.get(query));// Sales
        System.out.println("------------------------------------------------------");
 //  Modifying a key after inserting:
        p2.setId(99);
        System.out.println("Value of p2 after mutating ID : " + roles.get(p2)); // Null since hashcode has been changed
        System.out.println("----------------------------------------------------------------");
// Here the hashcode changed but the HashMap does not track changes, so p2 is still using the old hashocode when id = 2

// ========================= Task 4 ==================================

        Set<Product> inventory = new HashSet<>();

        inventory.add(new Product(101,45.95));
        inventory.add(new Product(101,99.99));
        inventory.add(new Product(102,34.00));

        System.out.println("Size of inventory set : " + inventory.size()); // is 2 since 101 is duplicated
        System.out.println("---------------------------------------------------------");

        // Student Registry test

        Set <Student> registry = new HashSet<>();

        registry.add(new Student ("Rhea.Ripley@gmail.com",711));
        registry.add(new Student ("Rhea.Ripley@gmail.com",713));
        System.out.println("Registry size : " + registry.size());
        System.out.println("--------------------------------------------------------------------");
        // if ID based, Size is 2 , if Email Based, Size is 1

       // Car Map

       Map<Car,String> parkingLot = new HashMap<>();
       Car myCar = new Car("44-P5R","Red");
       parkingLot.put(myCar,"Active Parking ticket");

       // retrieving using object with same platenumber

        Car queryCar = new Car("44-P5R","Blue");
        System.out.println("Status after changing color" + parkingLot.get(queryCar));

    // What if we mutate the plate number? (The Trap!)
        myCar.setPlateNumber("XYZ-999");
        System.out.println("Status after mutating license plate: " + parkingLot.get(myCar)); // Returns null!
    }//

    }





