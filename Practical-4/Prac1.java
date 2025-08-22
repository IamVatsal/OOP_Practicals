public class Prac1 {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setDetails("Vatsal", 142, "Computer Engineering");
        st1.display();
    }
}

class Student{
    private String name;
    private int id;
    private String course;

    public Student() {
        this.name = "Unknown";
        this.id = 0;
        this.course = "Unknown";
    }

    public void setDetails(String name,int id,String course){
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