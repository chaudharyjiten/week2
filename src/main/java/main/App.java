package main;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
   public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        Hedgehog newHedgehog = new Hedgehog();

        while (!exit) {
            
            System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");
            
            String userInput = sc.nextLine();
            
            int i = Integer.parseInt(userInput);
           
            switch (i) {
                case 1:
                    System.out.println("What does Hedgehog say?");
                    String message = sc.nextLine();
                    newHedgehog.message(message);
                    break;
                case 2:
                    System.out.println("What is the name of the hedgehog:");
                    String name = sc.nextLine();
                    System.out.println("What is the age of the hedgehog:");
                    String ageString = sc.nextLine();
                    int age = Integer.parseInt(ageString);
                    newHedgehog = new Hedgehog(name, age);
                    break;
 
                    case 3:
                        System.out.println("How many laps?");
                        String lap = sc.nextLine();
                        newHedgehog.run(Integer.parseInt(lap));
                        break;
                    
                case 0:
                    System.out.println("Thank you for using the program.");
                    exit = true;
                    break;
                        
                default:
                    System.out.println("Wrong input value");
                    break;
            }
        }
    }
}
