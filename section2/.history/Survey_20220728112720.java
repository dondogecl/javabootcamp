import java.util.Scanner;

public class Survey {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        System.out.println("Take this survey, it's an order.");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("How much money do you spend on Delivery?");
        double deliveryPrice = scan.nextDouble();
        counter++;

        // nextInt
        System.out.println("How many coffees do you drink per week?");
        int coffeeDrunk = scan.nextInt();
        counter++;

        System.out.println("\nThank you, " + name + " for answering all " + counter + " questions.");

        // close scan
        scan.close();

    }
}