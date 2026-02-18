import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
      boolean canVote = true;
        int x = 15;
        int y = 9;
        int w = 542;
        int g = 443;
        int t = 105;
        System.out.println(canVote);
        System.out.println(x == y);
        if (w > g) {
            System.out.println("W is larger than G");
        }
        int middle;
    if ((w >= g && w <= t) || (w <= g && w >= t)) {
        middle = w;
    } else if ((g >= w && g <= t) || (g <= w && g >= t)) {
        middle = g;
    } else {
        middle = t;
    }
    System.out.println("Middle Value = " + middle);3
    System.out.println("Enter a number: ");
    int selection = myObj.nextInt();
        switch (selection) {
            case 1:
                System.out.println("Color is Yellow");
            case 2:
                System.out.println("Color is Blue");
            case 3:
                System.out.println("Color is Red");
            default:
                System.out.println("Invalid Selection");
        }
    }
}
