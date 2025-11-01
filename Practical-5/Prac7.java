public class Prac7 {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        obj.show();
    } 
}


// Write a program to implement Multiple inheritance using interface.
interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A implements Printable, Showable {
    public void print() {
        System.out.println("Hello from Printable interface");
    }
    public void show() {
        System.out.println("Hello from Showable interface");
    }
}
