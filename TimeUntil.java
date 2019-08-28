import java.util.Scanner;

public class LogarithmBaseTwo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        Double number_entered, base_two_log;

        System.out.println("Enter your number: ");
        number_entered = scan.nextDouble();
        
        base_two_log = Math.log( number_entered ) / Math.log( 2 );

        System.out.println("The base two log of the number " + number_entered + "is " + base_two_log);
    }
}