import java.util.Scanner;

public class Atm {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        // variables for checking account and savings account
        int checkingAccount = 0;
        int savingsAccount = 0;

        // asks user to enter their account number
        System.out.println("Please enter your account number: ");
        int accountNumber = scan.nextInt();

        // asks user to enter their pin
        System.out.println("Please enter your pin: ");
        int pin = scan.nextInt();

        // checks if account number and pin are correct
        if (pin == 1234) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Incorrect account number or pin.");
        }

        // see available funds on checking account
        System.out.println("\nYour checking account balance is: " + checkingAccount);

        // enter an amount to withdraw from the checking account
        System.out.println("\nEnter an amount to withdraw from your checking account: ");
        int withdrawChecking = scan.nextInt();

        checkingAccount = checkingAccount - withdrawChecking;
        // show available funds on checking account
        System.out.println("\nYour checking account balance is: " + checkingAccount);

    }
}
