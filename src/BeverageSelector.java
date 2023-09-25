import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between one and three to receive the corresponding beverage.");
        System.out.println("Your options are:");
        System.out.println("1 (Water)");
        System.out.println("2 (Coke)");
        System.out.println("3 (Coffee)");
        int beverageChoice = sc.nextInt();
        while (1 > beverageChoice || 3 < beverageChoice) {
            System.out.println("That number is not an option. Please enter a number between one and three.");
            beverageChoice = sc.nextInt();
        }
        if (beverageChoice == 1) {
            System.out.println("You chose water. Thanks for shopping with us!");
        } else if (beverageChoice == 2) {
            System.out.println("You chose coke. Thanks for shopping with us!");
        } else {
            System.out.println("You chose coffee. Thanks for shopping with us!");
        }
    }
}
