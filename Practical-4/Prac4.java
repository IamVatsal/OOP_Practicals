public class Prac4 {
    public static void main(String[] args) {
        System.out.println("\nPerson1 Details:");
        Person person1 = new Person("Vatsal", 20);
        person1.displayInfo();

        System.out.println("\nPerson2 Details:");
        Person person2 = new Person("Janvi");
        person2.displayInfo();

        System.out.println("\nPerson3 Details:");
        Person person3 = new Person();
        person3.displayInfo();
    }
}

class Person {
    String name;
    int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}