import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer.");
        //This defines the double "firstInt" as their input. I chose a double here so that they can enter a number with multiple digits.
        double firstInt = sc.nextDouble();
        System.out.println("Please enter the second integer.");
        double secondInt = sc.nextDouble();
        if (makes10(firstInt, secondInt) == true) {
            System.out.println("Yay! Your two numbers add up to 10!");
        } else {
            System.out.println("I regret to inform you that your numbers do not add up to 10.");
        }
    }

    public static boolean makes10(double firstInt, double secondInt) {
        double combinedNumber = firstInt + secondInt;
        if (combinedNumber == 10) {
            return true;
        } else {
            return false;
        }
    }
}
