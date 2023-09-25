import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        //This creates a new scanner system.
        Scanner sc = new Scanner(System.in);
        //This asks the user for the first number, warning them that an input of 0 will end the program.
        System.out.println("Please enter your first number. Note that the program will terminate upon the input '0'.");
        //This defines the double "inputNumber" as their input.
        double inputNumber = sc.nextDouble();
        //This starts an "if" statement, giving an error message if the input number is 0.
        if (inputNumber == 0) {
            //This prints out the error message.
            System.out.println("You input 0. The program will now terminate.");
            //This ends the program.
            return;
        }
        //This asks the user to input their second number.
        System.out.println("Please enter your second number.");
        //This defines the double "secondNumber" as their input.
        double secondNumber = sc.nextDouble();
        //This starts an "if" statement, ending the program if the second number is 0.
        if (secondNumber == 0) {
            //This prints out the error message.
            System.out.println("You input 0. The program will now terminate.");
            //This ends the program.
            return;
        }
        //This starts a "while" loop, executing the interior as long as the inputNumber is not 0.
        while (inputNumber < 0 || inputNumber > 0) {
            //This prints out the current sum.
            System.out.println("The current sum is " + (inputNumber + secondNumber));
            //This defines the numberSum variable as the sum of the numbers.
            double numberSum = inputNumber + secondNumber;
            //This redefines the secondNumber as the sum of the past two numbers.
            secondNumber = numberSum;
            //This asks the user to input the next number.
            System.out.println("Please enter your next number.");
            //This redefines the input number as their new input, so that when it loops, the input number is their new input
            // and the second number is the sum of the past two numbers.
            inputNumber = sc.nextDouble();
        }
        //This prints out the termination message when the "while" loop is done executing.
        System.out.println("Your final sum is " + secondNumber + ". This program will now terminate.");
    }
}