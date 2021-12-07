import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // part 1
        System.out.println("Howdy, DevmMountain!");

        // part 2

        Scanner input = new Scanner(System.in); // get input

        System.out.println("What is your favorite color?");
        String color = input.nextLine();  // Get user input
        System.out.println("Nice, I like " + color + " too");

        // part 3 Mars Adventure Game
        System.out.println("Welcome to the Mars Adventure");

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.printf("%nHi %s happy to have you aboard", name);

        System.out.println("What color will your spacesuit be?");
        String suitColor = input.nextLine();
        System.out.printf("A %s spacesuit, okay sounds good.",suitColor);

        System.out.println("Do you have pet? (y/n)");
        String hasPet = input.nextLine();
        if (hasPet.equalsIgnoreCase("y")) {
            System.out.println("Great what is your pet's name?");
            String petName = input.nextLine();
            System.out.printf("%nCute name! %s will need a space suit as well. Pick a color", petName);
            String petColor = input.nextLine();
            System.out.printf("%nA %s color suit for you, and a %s color suit for %s. You guys look amazing", suitColor, petColor, petName);
        } else {
            System.out.println("Nothing is wrong with being a lone traveler. Good luck and godspeed.");
        }



    }
}
