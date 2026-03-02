import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int upperLimit;
        while (true) {
            System.out.print("Choose a number; 100-999:");
            if (input.hasNextInt()) {
                upperLimit = input.nextInt();
                if (upperLimit >= 100 && upperLimit <= 999) {
                    break;
                } else {
                    System.out.println("Error: Number isn't between 100 and 999");
                }
            } else {
                System.out.println("Error: Pick a valid interger");
                input.next();
            }
        }
        System.out.println("Numers divisiible by 13 from 1 to " + upperLimit + ":");
    for (int i = 1; i <= upperLimit; i++) {
        if (i % 13 == 0) {
            System.out.print(i + " ");
        }
    }
    System.out.println();
    input.close();
    }
}