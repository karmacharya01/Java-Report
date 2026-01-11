package Lab4InheritanceAndPackaging;

//Write a program to demonstrate the concept of overriding methods.
class ParentClass {
    void display() {
        System.out.println("Parent Class");
    }
}

class DerivedClass extends ParentClass {
    @Override
    void display() {
        System.out.println("Derivrd Class");
    }
}

public class Program4 {
    public static void main(String[] args) {
        ParentClass obj = new DerivedClass();
        obj.display();
    }
}