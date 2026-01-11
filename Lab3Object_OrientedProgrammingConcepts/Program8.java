package Lab3Object_OrientedProgrammingConcepts;

//Write a program to demonstrate the concept of anonymous inner class.
class A {
    void display() {
        System.out.println("Super Class");
    }
}

class B {
    A a = new A() {
        void display() {
            System.out.println("Anonymous Inner Class");
        }
    };

    void show() {
        a.display();
    }
}

public class Program8 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
