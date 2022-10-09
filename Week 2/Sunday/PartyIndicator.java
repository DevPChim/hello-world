import java.util.Scanner;

class PartyIndicator {
    public static void main(String[] args) {

        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second represents the number of boys

        Scanner reader = new Scanner(System.in);

        System.out.println("Girls: \n Boys: ");
        int Girls = reader.nextInt();
        int Boys = reader.nextInt();

        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        // it should print: The party is excellent!

        if (Girls == Boys & Girls + Boys >= 20) {
            System.out.println("The party is excellent");

            // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
            // it should print: Quite a cool party!

        } else if (Girls + Boys >= 20 & Girls != Boys) {
            System.out.println("Quite a cool party");

            // If there are less people coming than 20
            // it should print: Average party...

        } else if (Girls + Boys < 20) {
            System.out.println("Average party...");

            // If no girls are coming, regardless the count of the people
            // it should print: Sausage party

        } else if (Girls == 0) {
            System.out.println("Sausage party");
        }

    }
}