import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Hudson";
        System.out.println(name);
        int age = 17;
        System.out.println(age);
        char theCharacter = 'H';
        System.out.println(theCharacter);
        double interestRate = 2.99d;
        System.out.println(interestRate);
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name: ");
        String userInput = myObj.nextLine();
        System.out.println(userInput);
        System.out.println("Enter Age:");
        int theAge = Integer.parseInt(myObj.nextLine());
        System.out.println(theAge);
        int blinks = 200;
        int minutes = 7;
        double blinksPerMinute = (double) blinks / minutes;
        System.out.println(blinksPerMinute);
        System.out.println("Enter a Double: ");
        double accountBalance = myObj.nextDouble();
        System.out.printf("Balance: $%.2f",accountBalance);
    }
}
