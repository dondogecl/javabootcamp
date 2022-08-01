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
    }
}