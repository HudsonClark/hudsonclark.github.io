import java.util.Scanner;
class Main {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the hour in military time (1-24): ");
int hour = 7;
 if (hour > 16) {
System.out.println("Good evening");
}
else if (hour > 12 && hour < 16) {
System.out.println("Good afternoon");
}
else if (hour > 6 && hour < 12) {
System.out.println("Good morning");
}
else {
System.out.println("Good day");
}
}
} 