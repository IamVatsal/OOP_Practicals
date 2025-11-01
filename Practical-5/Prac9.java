public class Prac9 {
    public static void main(String[] args) {
        E obj = new E();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        obj.methodD();
    }    
}

interface A {
    void methodA();
    
}

interface B {
    void methodB();
}

interface C extends A, B {
    void methodC();
}

class D {    
    void methodD() {
        System.out.println("Method of class D");
    }
}

class E extends D implements C {
    public void methodA() {
        System.out.println("Implementation of methodA from interface A");
    }

    public void methodB() {
        System.out.println("Implementation of methodB from interface B");
    }

    public void methodC() {
        System.out.println("Implementation of methodC from interface C");
    }
}