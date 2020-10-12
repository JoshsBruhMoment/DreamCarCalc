
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

   Scanner myObj = new Scanner (System.in);
System.out.println("Please type your dream cars name");
String name = myObj.nextLine();

System.out.println("Please type your dream cars price");
double price = myObj.nextDouble();

System.out.println("You are sure you want this car?");
boolean confirm = myObj.nextBoolean();

if (boolean confirm = yes)
{System.out.println("Your final choice is " + name "which came out to " + price);}
  }
}