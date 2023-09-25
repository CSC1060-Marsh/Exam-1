import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        //This adds a new scanner system to the program.
        Scanner sc = new Scanner(System.in);
        //This asks the user to input a number.
        System.out.println("Please enter a number between one and three to receive the corresponding beverage.");
        //This adds a line defining the following as options.
        System.out.println("Your options are:");
        //This prints out the first option.
        System.out.println("1 (Water)");
        //This prints out the second option.
        System.out.println("2 (Coke)");
        //This prints out the third option.
        System.out.println("3 (Coffee)");
        //This defines the integer "beverageChoice" as their numerical input.
        int beverageChoice = sc.nextInt();
        //This starts a "while" loop, giving an error message if the number is not between 1 and 3 (inclusive).
        while (1 > beverageChoice || 3 < beverageChoice) {
            //This gives the error message and asks them to input another number.
            System.out.println("That number is not an option. Please enter a number between one and three.");
            //This redefines the beverage choice as their new input.
            beverageChoice = sc.nextInt();
        }
        //This starts an "if" chain, this first condition is if their input is 1.
        if (beverageChoice == 1) {
            //This prints out the following message if the above is true.
            System.out.println("You chose water. Thanks for shopping with us!");
            //This makes an "else if" statement, this condition is if their input is 2.
        } else if (beverageChoice == 2) {
            //This prints out the following message if the above is true.
            System.out.println("You chose coke. Thanks for shopping with us!");
            //This makes an "else" statement, this being if they input any number that is not 1 or 2
            // (it already gave an error message if it is above 3 or below 1, so this is equivalent to saying "else if (beverageChoice == 3)".
        } else {
            //This prints out the following message if all the if conditions are false.
            System.out.println("You chose coffee. Thanks for shopping with us!");
        }
    }
}
