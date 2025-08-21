public class Prac1 {
    public static void main(String[] args) {
        Student st1 = new Student("Vatsal", "24012011142", "Computer Engineering");
        st1.display();
    }
}

class Student{
    String name;
    String id;
    String course;

    public Student(String name, String id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void setDetails(String name,String id,String course){
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
    }
    
}