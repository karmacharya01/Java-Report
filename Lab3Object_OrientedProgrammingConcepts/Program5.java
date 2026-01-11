package Lab3Object_OrientedProgrammingConcepts;

//Write a program to demonstrate the concept of passing by value.
public class Program5 {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        Program5 obj=new Program5();
        obj.Sum(a,b);
    }

    void Sum(int a,int b){
        int c=a+b;
        System.out.println("Inside the method:"+c);
    }
}
