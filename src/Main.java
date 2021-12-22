import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // get input

        System.out.println("Welcome to the Mars Adventure");

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.printf("%nHi %s happy to have you aboard", name);

        System.out.println("Are you excited for your grand adventure (y/n)");
        char isExcited = input.nextLine().charAt(0);
        if (Character.toLowerCase(isExcited) == 'y') {
            System.out.println("Yay we're excited to have you here");
        } else {
            System.out.println("Wrong answer buddy...you ARE excited.");
        }

        System.out.println("How many suitcases are you bringing");
        int numOfSuitcases = Integer.parseInt(input.nextLine());
        if (numOfSuitcases > 2) {
            System.out.println("That's too many suitcases. Two is the max.");
        } else if (numOfSuitcases == 2) {
            System.out.println("Perfect");
        } else {
            System.out.println("Did you bring anything... good packing skills I guess.");
        }

        System.out.println("Do you have pet? (y/n)");
        String petName;
        String hasPet = input.nextLine();
        if (hasPet.equalsIgnoreCase("y")) {
            System.out.println("Great what is your pet's name?");
            petName = input.nextLine();
            System.out.printf("%n %s, cute name! Happy to have you two aboard.", petName);
        } else {
            System.out.println("Nothing is wrong with being a lone traveler.");
            petName = "no pet";
        }
        System.out.printf("Okay %s it's time to go you have %d suitcases and %s is traveling with you.%n", name,numOfSuitcases,petName);
        for (int i = 0; i < 5; i++){
            System.out.println(i + "...");
        }
        System.out.println("Good luck and godspeed! Blast off!");
    }
}
