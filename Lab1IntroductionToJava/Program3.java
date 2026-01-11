package Lab1IntroductionToJava;

//Write a program that takes three numbers as input to calculate sum and average.
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        int[] arr = new int[3];
        Scanner input = new Scanner(System.in);

        int sum = 0; // initialize sum
        System.out.println("Enter any 3 integer:");
        for (int i = 0; i < 3; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        float average = sum / 3.0f; // use float division
        System.out.println("Sum: " + sum + "\t Average: " + average);
    }
}
