import java.util.Scanner;
import java.time.LocalDateTime;

public class TimeUntil
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        int[] current_time, proposed_time;
        int proposed_second, proposed_minute, proposed_hour, difference_hour, difference_minute, difference_second, final_hours = 0, final_minutes = 0, final_seconds = 0;
        String user_entered_time;
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

        // System.out.println(current_time[0]);
        // System.out.println(current_time[1]);
        // System.out.println(current_time[2]);

        // System.out.println("");

        // System.out.println(difference_hour);
        // System.out.println(difference_minute);
        // System.out.println(difference_second);

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

        // System.out.println(difference_hour);
        // System.out.println(difference_minute);
        // System.out.println(difference_second);

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
            final_hours = difference_hour;
        }

        if (show_minute)
        {
            final_minutes = difference_minute;
        }

        if (show_second)
        {
            final_seconds = difference_second;
        }

        System.out.println("There are " + final_hours + " hours " + final_minutes + " minutes and " + final_seconds + " seconds until then");
    }
}