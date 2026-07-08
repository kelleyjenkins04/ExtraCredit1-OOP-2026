import java.util.Scanner;

public class TemperatureCheck {
    public static void main (String[] augs) {

        int temperature = userTemp();

        if ( temperature <= 32 ){
            System.out.println("It is freezing!");
        }else if ( temperature <= 50 ){
            System.out.println("It is cold!");
        }else if ( temperature <= 85 ){
            System.out.println("It is warm!");
        }else
            System.out.println("It is hot!");
            


    }

    public static int userTemp(){
        Scanner keyboard = new Scanner(System.in);
        int temperature;

        System.out.println("Enter in the temperature: ");
        temperature = keyboard.nextInt();

        return temperature;
    }
}
