import java.util.Scanner;

public class TicketCost{
    static final double TICKET_COST = 15.0;

    public static void main ( String[] augs){
            int numOfTickets = 0;
            Scanner keyboard = new Scanner(System.in);

            System.out.println("How many tickets are you buying?: ");
            numOfTickets = keyboard.nextInt();

            printTotal(numOfTickets);

            keyboard.close();
    }

    public static void printTotal (int numOfTickets){
        System.out.println("Your total is: $" + String.format("%.2f",numOfTickets * TICKET_COST));
    }
}