import java.util.Scanner;

public class TemperatureCheck {
    public static void main ( String[] augs ) {

        int temperature = userTemp(); //temperature value 

        if ( temperature <= 32 ){
            System.out.println("It is freezing!");
        }else if ( temperature <= 50 ){
            System.out.println("It is cold!");
        }else if ( temperature <= 85 ){
            System.out.println("It is warm!");
        }else
            System.out.println("It is hot!");
            


    }

    //function used for practice in java
    //asks user for integer temperature value, reads inputted value, and returns integer to main function
    public static int userTemp(){
        Scanner keyboard = new Scanner(System.in); //allows user input
        int temperature; // temperature value

        System.out.println("Enter in the temperature: ");
        temperature = keyboard.nextInt();

        return temperature;
    }
}
