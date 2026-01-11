package Lab5HandlingErrrorException;

//Write a program to demonstrate the concept of try and multiply catch block.
public class Program1 {
    public static void main(String[] args) {

        try {
            int a = 10, b = 0;
            int c = a / b;              // ArithmeticException

            int[] arr = new int[3];
            arr[5] = 20;                // ArrayIndexOutOfBoundsException

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught");

        } catch (Exception e) {
            System.out.println("General Exception caught");
        }

        System.out.println("Program continues...");
    }
}
