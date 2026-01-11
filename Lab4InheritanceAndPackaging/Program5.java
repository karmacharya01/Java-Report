package Lab4InheritanceAndPackaging;

//Write a program to demonstrate the concept of interface.
interface A {
    void Even(int a);
}

interface B {
    void SumOfNaturalNum(int b);
}

class Program5 implements A, B {

    public static void main(String[] s) {
        Program5 obj = new Program5();
        obj.Even(5);
        obj.SumOfNaturalNum(10);
    }

    @Override
    public void Even(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.err.println("Not a even Number");
        }
    }

    @Override
    public void SumOfNaturalNum(int b) {
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum += i;
        }
        System.out.println("Sum:" + sum);
    }
}
