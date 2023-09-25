import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        //This adds a new scanner system.
        Scanner sc = new Scanner(System.in);
        //This asks the user to input the first integer.
        System.out.println("Please enter the first integer.");
        //This defines the double "firstInt" as their input. I chose a double here so that they can enter a number with multiple digits.
        double firstInt = sc.nextDouble();
        //This asks the user to input the second integer.
        System.out.println("Please enter the second integer.");
        //This defines the double "secondInt" as their input. I chose a double here for the same reason.
        double secondInt = sc.nextDouble();
        //This starts an "if" statement, calling the return value from the makes10 boolean program.
        if (makes10(firstInt, secondInt) == true) {
            //This prints out the following message if the above is true.
            System.out.println("Yay! Your two numbers add up to 10!");
            //This starts an "else" statement, meaning that if the above is true, it will execute.
        } else {
            //This prints out the following message if the above is true.
            System.out.println("I regret to inform you that your numbers do not add up to 10.");
        }
    }
    //This creates a a public static boolean named "makes10", loading in the firstInt and secondInt for calculations.
    public static boolean makes10(double firstInt, double secondInt) {
        //This creates a new variable "combinedNumber" as the sum of their inputs.
        double combinedNumber = firstInt + secondInt;
        //This starts an "if" statment if the combined number is 10.
        if (combinedNumber == 10) {
            //This returns true if the above is true.
            return true;
            //This starts an "else" statement if the combined number is not 10.
        } else {
            //This returns false if the if statement is false.
            return false;
        }
    }
}
