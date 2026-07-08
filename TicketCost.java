import java.util.Scanner;

public class TicketCost{
    private static final double TICKET_COST = 15.0; //cost per ticket (CONSTANT)

    public static void main ( String[] augs ){
            int numOfTickets = 0; //amount of tickets user wants
            Scanner keyboard = new Scanner(System.in); //allows user to input integer

            System.out.println("How many tickets are you buying?: ");
            numOfTickets = keyboard.nextInt();

            printTotal(numOfTickets);

            keyboard.close();
    }

    //function added for practice in java
    //prints total dollar amount with 2 decimal points 
    public static void printTotal ( int numOfTickets ){
        System.out.println("Your total is: $" + String.format("%.2f",numOfTickets * TICKET_COST));
    }
}