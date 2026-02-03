import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int squareFeet;
    double costPerSquareFoot;
    int length;
    int width;
    double totalCost;
    Scanner myInput = new Scanner(System.in); 
    System.out.println("Enter the length of the room in feet: ");
    length = myInput.nextInt();
    System.out.println("Enter the width of the room in feet: ");
    width = myInput.nextInt();
    System.out.println("Enter the cost of 1 sq. ft. of tile: ");
    costPerSquareFoot = myInput.nextDouble();

    System.out.println("Length: "+length+"\n"+"Width: "+width);
    squareFeet = length * width;
    totalCost = squareFeet * costPerSquareFoot;

    System.out.println("Total Cost: $"+totalCost);
    System.out.printf("Area: %d%nTotal Cost: $%.2f",squareFeet,totalCost);
  }
}
