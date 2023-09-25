import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first number. Note that the program will terminate upon the input '0'.");
        double inputNumber = sc.nextDouble();
        System.out.println("Please enter your second number.");
        double secondNumber = sc.nextDouble();

        while (inputNumber < 0 || inputNumber > 0) {
            System.out.println("The current sum is " + (inputNumber + secondNumber));
            double numberSum = inputNumber + secondNumber;
            secondNumber = numberSum;
            System.out.println("Please enter your next number.");
            inputNumber = sc.nextDouble();
        }
        System.out.println("Your final sum is " + secondNumber + ". This program will now terminate.");
    }
}