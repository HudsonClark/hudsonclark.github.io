import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String name;
        String firstInitial;
        String secondInitial;
        int aNumber;
        int anotherNumber;
        System.out.println("Please enter your name: ");
        name = myObj.nextLine();
        System.out.println("Please enter your first initial:");
        firstInitial = myObj.nextLine();
        System.out.println("Please enter your second initial:");
        secondInitial = myObj.nextLine();
        System.out.println("Enter an integer: ");
        aNumber = myObj.nextInt();
        System.out.println("Enter another integer: ");
        anotherNumber = myObj.nextInt();
        System.out.println(aNumber +" + "+ anotherNumber +" = "+ (aNumber+anotherNumber));
        System.out.println(aNumber +" - "+ anotherNumber +" = "+ (aNumber-anotherNumber));
        System.out.println(aNumber +" * "+ anotherNumber +" = "+ (aNumber*anotherNumber));
        System.out.println(aNumber +" / "+ anotherNumber +" = "+ ((double)aNumber/(double)anotherNumber));
    }
}
