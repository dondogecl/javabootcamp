import java.util.Scanner;

public class Survey {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Take this survey.");
        System.out.println("What it your name?");
        String name = scan.nextLine();

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();

        System.out.println("How much money do you spend on Delivery?");
        double deliveryPrice = scan.nextDouble();
        

    }
}