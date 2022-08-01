import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two integers on the same line");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("\nEnter two very big integers on the same line");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();

        System.out.println("\nEnter two decimals on the same line");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();

        System.out.println("\nEnter two text values on the same line");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        // print the two integers are:
        System.out.println("\nThe two integers are: " + num1 + " and " + num2);
        // print the two very big integers are:
        System.out.println("\nThe two very big integers are: " + bigNum1 + " and " + bigNum2);
        // print the two decimals are:
        System.out.println("\nThe two decimals are: " + decimal1 + " and " + decimal2);
        // print the two text values are:
        System.out.println("\nThe two text values are: " + text1 + " and " + text2);
    }
}