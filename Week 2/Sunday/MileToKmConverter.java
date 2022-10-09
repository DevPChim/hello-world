import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter miles: ");

        double mile = scan.nextDouble();
        double kilometer = mile * 1.6;

        System.out.println("Kilometers: " + kilometer);
        scan.close();

    }
}