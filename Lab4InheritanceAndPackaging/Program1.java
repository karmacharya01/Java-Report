package Lab4InheritanceAndPackaging;

//Write a program to demonstrate the concept of the abstract method and abstract class.
public abstract class Program1  {
    abstract void sum();

    public static void main(String[] args) {
        InnerAbstractClass obj = new InnerAbstractClass();
        obj.sum();
        obj.display();
    }
}

class InnerAbstractClass extends Program1 {
    void sum() {
        int a = 5, b = 3, c;
        c = a + b;
        System.out.println(c);
    }

    void display() {
        System.out.println("hello");
    }
}
