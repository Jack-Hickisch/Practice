import java.util.Scanner;
import java.time.LocalDateTime;

public class TimeUntil
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int[] current_time, proposed_time;
        int proposed_second, proposed_minute, proposed_hour, difference_hour, difference_minute, difference_second;
        String user_entered_time, final_hours = "", final_minutes = "", final_seconds = "";
        boolean show_hour = true, show_minute = true, show_second = true;

        System.out.println("Please enter the time in the format hh:mm:ss");
        user_entered_time = scan.nextLine();

        proposed_hour = Integer.parseInt(user_entered_time.substring(0, 2));
        proposed_minute = Integer.parseInt(user_entered_time.substring(3, 5));
        proposed_second = Integer.parseInt(user_entered_time.substring(6, 8));
        
        current_time = new int[]{LocalDateTime.now().getHour(), LocalDateTime.now().getMinute(), LocalDateTime.now().getSecond()};
        proposed_time = new int[]{proposed_hour, proposed_minute, proposed_second};

        difference_hour = proposed_time[0] - current_time[0];
        difference_minute = proposed_time[1] - current_time[1];
        difference_second = proposed_time[2] - current_time[2];

        if (!(proposed_hour == LocalDateTime.now().getHour() && proposed_minute == LocalDateTime.now().getMinute() && proposed_second == LocalDateTime.now().getSecond()))
        {
            if (difference_second < 0)
            {
                difference_minute -= 1;
                difference_second = 60 - ( -1 * difference_second );
            }
    
            if (difference_minute < 0)
            {
                difference_hour -= 1;
                difference_minute = 60 - ( -1 * difference_minute );
            }
    
            if (difference_hour < 0)
            {
                difference_hour = 24 - ( -1 * difference_hour );
            }
    
            if (difference_hour == 0)
            {
                show_hour = false;
            }
    
            if (difference_minute == 0)
            {
                show_minute = false;
            }
    
            if (difference_second == 0)
            {
                show_second = false;
            }
    
            if (show_hour)
            {
                final_hours = Integer.toString(difference_hour) + " hours ";
            }
    
            if (show_minute)
            {
                final_minutes = Integer.toString(difference_minute) + " minutes ";
            }
    
            if (show_second)
            {
                final_seconds = Integer.toString(difference_second) + " seconds ";
            }
    
            System.out.println("There are " + final_hours + final_minutes + final_seconds + "until then");
        }
        else
        {
            System.out.println("That is the current time!");
        }
    }
}